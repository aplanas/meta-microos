SUMMARY = "Clock application designed for GNOME 3"
DESCRIPTION = "A nice simple app to show the time, date, and alarms."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-clocks-44.0-1.1.aarch64.rpm"
RPM_HASH = "148f94b54ecb91df3f04f3c1cf9ddaf111d1d8f6df98e2bf57e662b075796857ad63a56a6ad43af2b5d345f1137c6d9e4716f645887563fda3ff2fee61acae4f"

RPROVIDES:${PN} += "application() \
application(org.gnome.clocks.desktop) \
gnome-clocks \
gnome-clocks(aarch-64) \
metainfo() \
metainfo(org.gnome.clocks.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libgeoclue-2.so.0()(64bit) \
libgeocode-glib-2.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-desktop-4.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgweather-4.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
