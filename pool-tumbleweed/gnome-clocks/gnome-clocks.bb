SUMMARY = "Clock application designed for GNOME 3"
DESCRIPTION = "A nice simple app to show the time, date, and alarms."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-clocks-44.0-1.1.aarch64.rpm"
RPM_HASH = "148f94b54ecb91df3f04f3c1cf9ddaf111d1d8f6df98e2bf57e662b075796857ad63a56a6ad43af2b5d345f1137c6d9e4716f645887563fda3ff2fee61acae4f"

RPROVIDES:${PN} += "gnome-clocks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
libm.so.6"

inherit rpm
