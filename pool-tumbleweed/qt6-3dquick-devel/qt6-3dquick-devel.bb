SUMMARY = "Development files for the Qt 6 3DQuick library"
DESCRIPTION = "Development files for the Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquick-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5e439ab694bfb85e8f407cca9cc424565d44a0b33e8477c678eeb9b2b93684230c95c5c4f0b4c99e00390f2d3bd63ebd184d07446c5833adb788b6a2ef93de8f"

RPROVIDES:${PN} += "cmake-Qt63DQuick \
pkgconfig-Qt63DQuick \
qt6-3dquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt63DQuick6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
qt6-3dcore-private-devel"

inherit rpm
