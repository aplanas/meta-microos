SUMMARY = "Hotcorners applet"
DESCRIPTION = "Hotcorners offers the option to set corner actions, both from preset and custom commands. \
Pressure can be set from Budgie Settings. \
This is the new Vala-based hotcorners applet."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-hotcorners-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "b1a88044efde99648b88bca169a90494b6dbe52debc2b58319885f85ee9315f5ac5cfd4e12377580c9db7be2774fa00f6d1ab096f2e50d3f4fe3321ee0df67f1"

RPROVIDES:${PN} += "budgie-hotcorners-applet \
libhotcorners.so"

RDEPENDS:${PN} += "budgie-extras-lang \
budgie-screensaver \
dconf \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libnotify-tools \
libpeas-1.0.so.0 \
xdotool"

inherit rpm
