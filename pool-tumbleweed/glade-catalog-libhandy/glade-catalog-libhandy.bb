SUMMARY = "Glade catalog for libhandy"
DESCRIPTION = "libhandy is a library to help with developing UI for mobile devices \
using GTK+/GNOME. \
 \
This package provides a catalog for libhandy, to allow the use \
libhandy widgets in Glade."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "glade-catalog-libhandy-1.8.2-1.4.aarch64.rpm"
RPM_HASH = "6dd1fe1e2d2e34c8b5dc12e56507bfe018eb7e2ddc7576cb24a1f8a821f7ecee11dda7d0c7be60ad01400f02294922a2d28c3182afb2d87a275ea05e58424f6b"

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
