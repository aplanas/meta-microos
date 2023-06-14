SUMMARY = "Comics document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Comics documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-comicsdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "f7a9cb95b61bb2a4daac0bb645ce0fc2ae1b68a9c45111954dff644fd9fe2427e0c99eca83e5e7410c67db86b8e0a8d86c791435c57ee32d7f4f5aa4965238bc"

RPROVIDES:${PN} += "libcomicsdocument.so \
xreader-plugin-comicsdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
