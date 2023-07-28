SUMMARY = "Development files for the Poppler Qt6 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.07.0"

RPM_NAME = "libpoppler-qt6-devel-23.07.0-1.1.aarch64.rpm"
RPM_HASH = "c4aa68ba6f6d99c1c42c6b931769a6771fe669cc48e35f532a9e2767d97870b046f1413b7a9cff76323239e3828e24dd7b9900d3aba67847c098bc1e1a80453f"

RPROVIDES:${PN} += "libpoppler-qt6-devel \
pkgconfig-poppler-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Widgets \
libpoppler-devel \
libpoppler-qt6-3 \
pkgconfig-poppler"

inherit rpm
