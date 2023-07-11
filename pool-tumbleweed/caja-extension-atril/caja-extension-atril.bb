SUMMARY = "Atril extension for Caja file manager"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager. \
It adds an additional tab called 'Document' to the file properties \
dialog."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-extension-atril-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "01693c4252236c0e20fb804d7e54b6bb12c90ce7b74ef1d266dd5681e7e04bd9325774de1ae77f39e72efda775ff8dc1020af4825b34074b7275a962aa4c413b"

RPROVIDES:${PN} += "atril-caja \
caja-extension-atril \
libatril-properties-page.so \
mate-document-viewer-caja"

RDEPENDS:${PN} += "atril \
caja \
ld-linux-aarch64.so.1 \
libatrildocument.so.3 \
libc.so.6 \
libcaja-extension.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
