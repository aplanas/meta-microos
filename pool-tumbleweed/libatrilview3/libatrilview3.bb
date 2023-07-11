SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "libatrilview3-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "22ba4baa0b734de52945fbc45d87db287167de03387c165cedc9bdd8733723e813fe6da8ae9b4622e25f2610a8e1f3def5387a918f77fdae8b46a89b693151d6"

RPROVIDES:${PN} += "libatrilview.so.3 \
libatrilview3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatrildocument.so.3 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwebkit2gtk-4.0.so.37"

inherit rpm
