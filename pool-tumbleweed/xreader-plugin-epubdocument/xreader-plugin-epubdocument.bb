SUMMARY = "EPUB document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read EPUB documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-epubdocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "58eeb01c9732b688b2349c96c81a9746cb71b7fc1d1b46a76ade6e05260fbb19e1ac62dee35f55a452d1b7c5f684f533ddb9f5791c026067b8b312b95f740b8b"

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
