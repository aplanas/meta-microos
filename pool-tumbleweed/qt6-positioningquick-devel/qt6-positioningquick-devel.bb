SUMMARY = "Qt 6 PositioningQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioningquick-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "30c179f3c8e7fc2956b37d287b79988248b3cdc75b2d90889c293ccce37c45671e3e35224f47efc2a5c06b6248f554863c586d59132ac58dc8b83ab7a9f70808"

RPROVIDES:${PN} += "cmake-Qt6PositioningQuick \
pkgconfig-Qt6PositioningQuick \
qt6-positioningquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6PositioningQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
