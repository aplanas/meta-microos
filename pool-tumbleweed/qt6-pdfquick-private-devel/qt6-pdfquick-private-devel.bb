SUMMARY = "Non-ABI stable API for the Qt 6 PdfQuick library"
DESCRIPTION = "This package provides private headers of libQt6PdfQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdfquick-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "93715e42af442d7d13f0853eb35be9a2b7204cb9991347a943575d1364241cc54da4f88e73992436dbb67c49deb55262e0d6d286c109549c631fc2f5c1586e6e"

RPROVIDES:${PN} += "qt6-pdfquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfQuick"

inherit rpm
