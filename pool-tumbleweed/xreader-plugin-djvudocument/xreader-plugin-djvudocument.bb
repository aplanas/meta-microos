SUMMARY = "DjVu document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DjVu documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-djvudocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "cb2aac71ea9e7b8837957d7a5f2230558fe43fac25c64b93f14b06ff31f26f383a8fb54a5702815bf1ed769e8896fd79ba59035aec10e85319fceb1c94192520"

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
