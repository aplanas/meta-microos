SUMMARY = "Clock application designed for GNOME 3"
DESCRIPTION = "A nice simple app to show the time, date, and alarms."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-clocks-44.0-1.2.aarch64.rpm"
RPM_HASH = "03fe379606b47f0eeecc1e9641f6f2633dbb0f9e726537aa2efb296c833d7113c7b5327f00f4639132e0a5df8136d90ee521cac5ce7bc9a5d2f643086d437828"

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
