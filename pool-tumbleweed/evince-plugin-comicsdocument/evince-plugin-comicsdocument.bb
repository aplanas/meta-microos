SUMMARY = "Comics document support for Evince"
DESCRIPTION = "A plugin for Evince to read Comics documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-comicsdocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "27bca97f8874cf1ce791e2f3e7612fb477539d19ac6a4ab2c558dbc15420b9f217ea6c911e7b1c3771bbc04280d416b2800bd5e2a9d5962d2fa162bf5c04f8dd"

RPROVIDES:${PN} += "evince-plugin-comicsdocument \
libcomicsdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
