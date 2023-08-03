SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "This package provides private headers of libQt63DQuickScene2D that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickscene2d-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "48e622fe35a063d8d81b2b227e9263c3c878847e074a1265d93b51aee4e0074788b18147240642ea27166598d2cbb2c0da30c862571adcc3254b8b727d93c7c7"

RPROVIDES:${PN} += "qt6-3dquickscene2d-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuickScene2D \
qt6-3dcore-private-devel \
qt6-3dquick-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
