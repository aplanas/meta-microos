SUMMARY = "Development files for the Qt 6 3DQuickScene2D library"
DESCRIPTION = "Development files for the Qt 6 3DQuickScene2D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquickscene2d-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1580ef91da0793e5b556dcc5e2a94896d80279602c005a0cb9d56c11aa732a0f127bed3a74f151fb1db3ed547206e444940a8dc1f3ec07ee580cc4e869ccede0"

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
