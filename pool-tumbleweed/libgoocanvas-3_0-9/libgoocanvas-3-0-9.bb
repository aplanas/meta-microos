SUMMARY = "A Cairo-based canvas widget for GTK+"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. It has an optional model/view split, and uses interfaces \
for items and models, so any application object can be turned into a \
canvas item or model."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "libgoocanvas-3_0-9-3.0.0-2.9.aarch64.rpm"
RPM_HASH = "48f981d4ecf9089d78111a279a4160ce581911a0a638b890c6bc59ea0f4013a6169c48b4e72c8be28d73ac126318a42cfc028e66201faa328556c21512137587"

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
