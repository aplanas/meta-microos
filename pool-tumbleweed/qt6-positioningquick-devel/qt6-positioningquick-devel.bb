SUMMARY = "Qt 6 PositioningQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioningquick-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a16d5a17f91ec0d88ee7eb00c31eb7a7ab899ef940a3741d26f1214d6bbfd4c55adefeb6af619ce07b3047f4b898aaad80aa902a12777c610b8276c10627a0d8"

RPROVIDES:${PN} += "cmake-Qt6PositioningQuick \
pkgconfig-Qt6PositioningQuick \
qt6-positioningquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Positioning \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6PositioningQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
