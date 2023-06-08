SUMMARY = "Atril extension for Caja file manager"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager. \
It adds an additional tab called 'Document' to the file properties \
dialog."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "caja-extension-atril-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "1374501c4dd5e5ad22bfecb68585ee5a3da6e44b602997a094db351eeb124a23841f8e392077ada5969b92b862952cf9f3b3d8fdfffea3a858a4112cc17ea4e7"

RPROVIDES:${PN} += "atril-caja caja-extension-atril caja-extension-atril(aarch-64) libatril-properties-page.so()(64bit) mate-document-viewer-caja"
RDEPENDS:${PN} += "atril caja ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatrildocument.so.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcaja-extension.so.1()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
