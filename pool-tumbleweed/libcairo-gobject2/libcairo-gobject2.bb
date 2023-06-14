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

RPM_NAME = "libcairo-gobject2-1.17.8-1.1.aarch64.rpm"
RPM_HASH = "8d719606cfb635b2f113cb29051e582c2ce84f6093e7b22e865afeaa01a112619b16daceb5e342cdb7fe06cc512ef3da762e55499e4dc8af461c3f4f29f85626"

RPROVIDES:${PN} += "libcairo-gobject.so.2 \
libcairo-gobject2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
