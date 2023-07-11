SUMMARY = "Development files for the Poppler Qt5 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-qt5-devel-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "d30aa3216cfb497f47855dacb3080c5a32cbe8f6b340f04a19e68b1f761a5afd33ea20966682a84aa66ccd9f2296b37cc62dda174adeb683fdfeca5f6b92b51f"

RPROVIDES:${PN} += "libpoppler-qt5-devel \
pkgconfig-poppler-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpoppler-devel \
libpoppler-qt5-1 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5Xml \
pkgconfig-poppler"

inherit rpm
