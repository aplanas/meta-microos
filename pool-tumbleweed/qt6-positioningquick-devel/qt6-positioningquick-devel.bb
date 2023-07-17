SUMMARY = "Qt 6 PositioningQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioningquick-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "730b80b54b321703bbbeade1f4353526af618ad986ac1be62547f7902bc3e3fe86c9461fb0c9c156f1a62dc56be43c192564855d05cdb359719af6a867f40030"

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
