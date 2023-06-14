SUMMARY = "Kerberos 5 ticket monitoring tray applet"
DESCRIPTION = "krb5-auth-dialog is a tray applet that monitors and refreshes your \
Kerberos ticket. It pops up reminders when the ticket is about to \
expire. \
 \
It features ticket autorenewal and supports pkinit."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.alpha1"

RPM_NAME = "krb5-auth-dialog-44.0.alpha1-1.1.aarch64.rpm"
RPM_HASH = "d309f585902fe10980e4e5b8967c704796bd4bc3afb161250ee36a4b2b2cd00ffc5a5ef0e13e4c164d07bc6c5856a376f13d332e100320904f7b458d2293916e"

RPROVIDES:${PN} += "krb5-auth-dialog \
libka-plugin-afs.so \
libka-plugin-dummy.so \
libka-plugin-gnomelock.so \
libka-plugin-pam.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libkrb5.so.3"

inherit rpm
