SUMMARY = "EPUB document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read EPUB documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-epubdocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "5c8d9e9d391b4c661f46ef760225ad53fcb89a46dc912d92c80ea8a75b3af93d0f4d6f3c4cce3a58f9397bc8277c153aa2e1decf20ed5a6eb46647bcacf23a38"

RPROVIDES:${PN} += "libepubdocument.so \
xreader-plugin-epubdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxml2.so.2 \
libxreaderdocument.so.3 \
libz.so.1 \
xreader"

inherit rpm
