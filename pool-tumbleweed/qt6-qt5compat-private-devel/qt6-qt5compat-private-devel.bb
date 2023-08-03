SUMMARY = "Non-ABI stable API for the Qt 6 Qt5 Compat library"
DESCRIPTION = "This package provides private headers of libQt6Core5Compat that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qt5compat-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "136a87fb50d4ef898e7689dc044be32807af2613139d1e845e4b7d369b9e9fd85eed3b5a336fd5a46db02a9f3837e25e4b1dc3f805536897849f367949ecd35b"

RPROVIDES:${PN} += "qt6-qt5compat-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core5Compat \
qt6-core-private-devel"

inherit rpm
