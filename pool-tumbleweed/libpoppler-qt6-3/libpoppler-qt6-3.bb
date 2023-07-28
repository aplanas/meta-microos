SUMMARY = "Qt6 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-qt6-3-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "e1ec39da5b6281630a937804fb885f3e291061976c9682b36f166cf0b340c3603e6c015a1e202ffc5cde3a661660a4e7cc694a64e889b2111883f9b39af2db36"

RPROVIDES:${PN} += "libpoppler-qt6-3 \
libpoppler-qt6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libfreetype.so.6 \
liblcms2.so.2 \
libpoppler.so.130 \
libpoppler130 \
libstdc++.so.6"

inherit rpm
