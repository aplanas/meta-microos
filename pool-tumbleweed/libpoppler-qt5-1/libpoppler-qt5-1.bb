SUMMARY = "Qt5 wrapper for the Poppler PDF rendering library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-qt5-1-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "42a9e1964bb02a2f675bf638e96c4dc258d585188e05764510cc5fa632ff8dbf4e4109323252524952a4c91d612d8dab8a8151ba3953f3040e6e955a3851235c"

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
libpoppler.so.129 \
libpoppler129 \
libstdc++.so.6"

inherit rpm
