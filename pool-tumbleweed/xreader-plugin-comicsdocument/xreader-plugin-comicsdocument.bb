SUMMARY = "Comics document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Comics documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-comicsdocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "d87b27d9a41fcc748ff70c09e5681facaee4a8f7f22a4111000c01dc3e4089fc51b5634bbb4e2a73a0f22ba04b1a4d08504565e5ae69f1228d81b096a06e0e1b"

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
