SUMMARY = "Hotcorners applet"
DESCRIPTION = "Hotcorners offers the option to set corner actions, both from preset and custom commands. \
Pressure can be set from Budgie Settings. \
This is the new Vala-based hotcorners applet."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-hotcorners-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "a29379f216cf14d506f03c9157c11e9334abd2109a2153d9a81212d180dfd093038c3ca9ebd53a61e113272ca2aa17669559ba3a6d797c89a3f6aad7911fb327"

RPROVIDES:${PN} += "application() \
application(org.ubuntubudgie.budgie-extras.HotCorners.desktop) \
budgie-hotcorners-applet \
budgie-hotcorners-applet(aarch-64) \
libhotcorners.so()(64bit)"

RDEPENDS:${PN} += "budgie-extras-lang \
budgie-screensaver \
dconf \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbudgie-plugin.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnotify-tools \
libpeas-1.0.so.0()(64bit) \
xdotool"

inherit rpm
