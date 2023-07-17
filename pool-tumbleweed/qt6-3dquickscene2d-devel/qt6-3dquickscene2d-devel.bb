SUMMARY = "Development files for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "Development files for the Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickscene2d-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "48d0b1eb9a5db18e9a2ed88e6c91dfd1d8d7bafaea89ba70f5a66df64de36660824049033bd37efa490849da9f7ba887e4b8474025ba813cbd380c5f2c3f03dc"

RPROVIDES:${PN} += "cmake-Qt63DQuickScene2D \
pkgconfig-Qt63DQuickScene2D \
qt6-3dquickscene2d-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt63DQuick \
cmake-Qt63DRender \
cmake-Qt6Gui \
cmake-Qt6Qml \
libQt63DQuickScene2D6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt63DQuick \
pkgconfig-Qt63DRender \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml"

inherit rpm
