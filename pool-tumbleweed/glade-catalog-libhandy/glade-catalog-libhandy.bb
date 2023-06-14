SUMMARY = "Glade catalog for libhandy"
DESCRIPTION = "libhandy is a library to help with developing UI for mobile devices \
using GTK+/GNOME. \
 \
This package provides a catalog for libhandy, to allow the use \
libhandy widgets in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "glade-catalog-libhandy-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "b8fb3147ddd2442861b039ed0f5ac5cfc1c19f6195cc2a42700525387c470254a84d043c3e4371ad2a33612c7b5ab92f097ba177711a3e233088af1c1a4340ff"

RPROVIDES:${PN} += "glade-catalog-libhandy \
libglade-handy-1.so"

RDEPENDS:${PN} += "glade \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgladeui-2.so.13 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libm.so.6"

inherit rpm
