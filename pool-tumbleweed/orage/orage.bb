SUMMARY = "Time-managing Application for the Xfce Desktop Environment"
DESCRIPTION = "Orage is a fast and easy to use graphical calendar for the Xfce desktop \
environment. It uses the portable ical format and includes common calendar \
features like repeating appointments and multiple alarming possibilities. Orage \
does not have group calendar features and can only be used for single user."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "orage-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "d0bd47affa099369c2e7598c44c450a0a61d940f912da994d6ac91d1f85bb916857ddeb70348ec68ab1e35f44f4bdf1ffc459aa2864f8c99fa7f661e79242cda"

RPROVIDES:${PN} += "application() \
application(org.xfce.orage-settings.desktop) \
application(org.xfce.orage.desktop) \
metainfo() \
metainfo(org.xfce.orage.appdata.xml) \
mimehandler(text/calendar) \
orage \
orage(aarch-64) \
orage-doc \
xfcalendar"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libical.so.3()(64bit) \
libicalss.so.3()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit)"

inherit rpm
