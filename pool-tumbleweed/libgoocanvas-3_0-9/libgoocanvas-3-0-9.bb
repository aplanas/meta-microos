SUMMARY = "A Cairo-based canvas widget for GTK+"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. It has an optional model/view split, and uses interfaces \
for items and models, so any application object can be turned into a \
canvas item or model."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "libgoocanvas-3_0-9-3.0.0-2.10.aarch64.rpm"
RPM_HASH = "1a7cdb46ebe8691e203bd57d8cd7308478ad28a322ab76eabcf312ce68ae404308896d694246f2a22d8a31402d5b9cba63862cf6fc474a417a4f188f6ef64977"

RPROVIDES:${PN} += "goocanvas \
libgoocanvas-3-0-9 \
libgoocanvas-3.0.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
