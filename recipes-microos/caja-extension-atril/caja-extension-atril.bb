SUMMARY = "Atril extension for Caja file manager"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager. \
It adds an additional tab called 'Document' to the file properties \
dialog."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-extension-atril-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "bf1f8a19939c142d95d3850c8590019bbcb1dfe9028450224b93f3ea8ec23e7a0f829fb09bb8776632a2fc4e3b4c76d3852cf3e180a421d8569d1adc6f56f98f"

RPROVIDES:${PN} += "atril-caja \
caja-extension-atril \
caja-extension-atril(aarch-64) \
libatril-properties-page.so()(64bit) \
mate-document-viewer-caja"
RDEPENDS:${PN} += "atril \
caja \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatrildocument.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcaja-extension.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
