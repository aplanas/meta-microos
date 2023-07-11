SUMMARY = "Vector Graphics Library with Cross-Device Output Support"
DESCRIPTION = "Cairo is a vector graphics library with cross-device output support. \
Currently supported output targets include the X Window System, \
in-memory image buffers, and PostScript. Cairo is designed to produce \
identical output on all output media while taking advantage of display \
hardware acceleration when available. \
 \
This library contains GType declarations for Cairo types. It is also \
meant to support gobject-introspection binding creation."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.17.8"

RPM_NAME = "libcairo-gobject2-1.17.8-1.2.aarch64.rpm"
RPM_HASH = "6f1d55cd91226a624aed9e980d0e6910e8507e4298521d9fcae3fe57892ac6ccd1c3bd0102659414afecc62e42ee7d463d06417aea86ebc48d13201380f903d0"

RPROVIDES:${PN} += "libcairo-gobject.so.2 \
libcairo-gobject2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
