SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "libatrildocument3-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "133efb00783f2b99f4d9877872151c9ce8c6d3a14ac485c4be32f81bd655f34cb9964536f2abd70186e4b938367162c0a2f81d223c526b309cd736f43d5db0c3"

RPROVIDES:${PN} += "libatrildocument.so.3 \
libatrildocument3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libsynctex.so.2"

inherit rpm
