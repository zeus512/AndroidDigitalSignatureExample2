package org.darkbyte.internhomework;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by root on 2/6/17.
 */

public class sharedprefs {
    public static final String myprefs = "myprefs";
    public static final String login_pin="login_pin";

    public sharedprefs(Context context) {
        sharedpreferences = context.getSharedPreferences(myprefs, Context.MODE_PRIVATE);
        editor = sharedpreferences.edit();
        this.context = context;
    }

    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;
    Context context;
    public void saveprefs(String loginstatus){

        editor.putString(login_pin,loginstatus);
        editor.commit();
    }
    public void clearprefs(String loginstatus){

        editor.putString(login_pin,null);
        editor.commit();
    }
    public  String getloginstatus() {
        return sharedpreferences.getString(login_pin,null);
    }


}
