SUMMARY = "DjVu document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DjVu documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-djvudocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "aedf19174fe3869844ce3472d00a774e26a4a15dfb6a54c1dbf2847318ebb799143a06259aa6e3d83107ee83808d69ce929f899948672cd54e87a7c7ebdf751b"

RPROVIDES:${PN} += "libdjvudocument.so \
xreader-plugin-djvudocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
