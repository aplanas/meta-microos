SUMMARY = "Document viewer for documents like PDF/PostScript"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "e0ad350e04050443e86f0a098004b440e60a6775e208b57a35b5a649d8f60f44a174740ea071e3e33ebce5c468f966332cad48c9175a26ad6080738d57195ca0"

RPROVIDES:${PN} += "caja-extension-xreader \
nemo-extension-xreader \
xreader \
xreader-backends"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxapp.so.1 \
libxreaderdocument.so.3 \
libxreaderview.so.3 \
xreader-plugin-pdfdocument"

inherit rpm
