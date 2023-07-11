SUMMARY = "Qt6 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-qt6-3-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "b3c67da6b3f624d29334276734b7b2475ff1674c04f8dd1a4b5c7047f225c86cf021d0da17d278b59a7b6432a3e77911d543d26929a0e7a8ef1a995a6d86f14b"

RPROVIDES:${PN} += "libpoppler-qt6-3 \
libpoppler-qt6.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libfreetype.so.6 \
liblcms2.so.2 \
libpoppler.so.129 \
libpoppler129 \
libstdc++.so.6"

inherit rpm
