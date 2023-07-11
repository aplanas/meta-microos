SUMMARY = "DjVu document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DjVu documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-djvudocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "4bbffe403b5f9a075b7a23f782eebbd7c9716c0a13c84f498cd23816036064e6a0781290f9db31aa56d732d8b750d8a0495cdedee13751f0e92076ecdb0f403c"

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
