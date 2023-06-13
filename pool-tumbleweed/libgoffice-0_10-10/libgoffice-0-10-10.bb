SUMMARY = "GLib/GTK+ Set of Document-Centric Objects and Utilities"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
These are common operations for document-centric applications that are \
conceptually simple, but complex to implement fully: plug-ins, load and \
save documents, undo and redo."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.55"

RPM_NAME = "libgoffice-0_10-10-0.10.55-1.3.aarch64.rpm"
RPM_HASH = "cd8f87210497a1bfba699f68b11872a1f4bc4b0860c9f88b88dcc4a3b1f5e298065900a1aed01c9947ebccb3354980905d46bffe42dc038bb420f4326d744136"

RPROVIDES:${PN} += "goffice \
libgoffice-0.10.so.10()(64bit) \
libgoffice-0_10-10 \
libgoffice-0_10-10(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsf-1.so.114()(64bit) \
libgtk-3.so.0()(64bit) \
liblasem-0.4.so.4()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libspectre.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
