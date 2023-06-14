SUMMARY = "Development files for the Poppler Qt5 wrapper library"
DESCRIPTION = "Poppler is a PDF rendering library, forked from the xpdf PDF viewer \
developed by Derek Noonburg of Glyph and Cog, LLC."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "23.05.0"

RPM_NAME = "libpoppler-qt5-devel-23.05.0-1.1.aarch64.rpm"
RPM_HASH = "db9cf49961af105ef7c252bbf927f3806ebbd71b33506ae06121402ec9fd6d59db909e693b961e2e4572db16ee5f009cd03875306d4a74724cab87f1c3a263db"

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
