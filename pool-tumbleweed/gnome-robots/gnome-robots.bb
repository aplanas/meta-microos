SUMMARY = "Robots Game for GNOME"
DESCRIPTION = "Robots is a graphical version of the original text based robots game, \
which can be found on a number of UNIX systems. The player must outwit \
the robots chasing him/her by getting them to run into each other."
LICENSE = "GPL-3.0-or-later"

PV = "40.0"

RPM_NAME = "gnome-robots-40.0-1.12.aarch64.rpm"
RPM_HASH = "5e1db7d8f416bc2f64dea21600ae616a57c0c1ef3c06b64219d7dda961e8042ae2a3366cdcb574ea978df542aa7c310435e810e7d9e6c7be0b05b60a0c2ec1ce"

RPROVIDES:${PN} += "application() \
application(org.gnome.Robots.desktop) \
gnome-robots \
gnome-robots(aarch-64) \
metainfo() \
metainfo(org.gnome.Robots.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-games-support-1.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
