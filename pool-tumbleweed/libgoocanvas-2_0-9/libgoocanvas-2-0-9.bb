SUMMARY = "A Cairo-based canvas widget for GTK+"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. It has an optional model/view split, and uses interfaces \
for items and models, so any application object can be turned into a \
canvas item or model."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "libgoocanvas-2_0-9-2.0.4-2.9.aarch64.rpm"
RPM_HASH = "34129ec17698bdaa3075772ac70117de24232cd5bc5439115e11bb04fd3624fb67daf75acfd092f719040742cb48c687f2ee006b8c117bf2a1d40d7f2a063974"

RPROVIDES:${PN} += "goocanvas2 \
libgoocanvas-2-0-9 \
libgoocanvas-2.0.so.9"

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
