SUMMARY = "Qt5 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-qt5-1-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "6c55bf935484cae6a99c48d128215b53f2a041f71b486afd18180894dc0d448e21685aae89720d32d5f72de9088d0fab03e63a184a47e21abd3feabfcf36969a"

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
libpoppler.so.128 \
libpoppler128 \
libstdc++.so.6"

inherit rpm
