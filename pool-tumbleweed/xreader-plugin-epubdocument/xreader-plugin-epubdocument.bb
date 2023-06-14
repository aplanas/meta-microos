SUMMARY = "EPUB document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read EPUB documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-epubdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "70b8ea10d3a840037707c779865e869c229e6b30183bfb81b7434e744dacc3342120a78af969034bec55d97f5f567d0dc929d9bfcb03dd82725ac0d32dbf0e8d"

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
