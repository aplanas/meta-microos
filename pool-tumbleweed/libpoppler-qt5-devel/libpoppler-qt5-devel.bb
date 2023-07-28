SUMMARY = "Development files for the Poppler Qt5 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-qt5-devel-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "66ab47519307a79bfa4a5b8fbe9e8c56536954bf75408759401e1290eba535330cfdb2b3185fcedbd609fe224ee09cb05032922ae85d92372c591a9a4bf2618c"

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
