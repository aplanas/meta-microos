SUMMARY = "Qt5 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-qt5-1-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "bd12ca1258969710e6957cacad30744160146b389a4a6f263a6d4884898f0715639c5024a58520f8d35e661519d0a30dcbaafe6fec6977d24af7b28121c83e60"

RPROVIDES:${PN} += "libpoppler-qt5-1 \
libpoppler-qt5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libfreetype.so.6 \
liblcms2.so.2 \
libpoppler.so.130 \
libpoppler130 \
libstdc++.so.6"

inherit rpm
