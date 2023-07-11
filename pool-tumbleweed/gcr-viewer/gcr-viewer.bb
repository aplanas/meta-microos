SUMMARY = "Viewer for Crypto Files"
DESCRIPTION = "This packages provides the viewer for crypto files on the GNOME desktop. \
key stores. \
 \
GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "gcr-viewer-4.1.0-1.2.aarch64.rpm"
RPM_HASH = "88a18230390a721fe6e8823f720c71c8b0b1b99a60aef1607d0175f5b99a43a891b37c706156e1195cce9f154812b2684747417213b0011c0280d2dc3161360d"

RPROVIDES:${PN} += "gcr-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
