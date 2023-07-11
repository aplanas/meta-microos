SUMMARY = "Development files for the Poppler Qt6 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.06.0"

RPM_NAME = "libpoppler-qt6-devel-23.06.0-1.1.aarch64.rpm"
RPM_HASH = "000fd081e253b1a774c711b5f457772022f3da9f258a77db60c5c60ebc09b550915661da15fe800ad3d31bf7f4a613d2245cddd466a8bb2c74538176d4d36256"

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
