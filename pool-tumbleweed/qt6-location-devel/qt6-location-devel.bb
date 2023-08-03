SUMMARY = "Qt 6 Location library - Development files"
DESCRIPTION = "Development files for the Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-location-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3ba77da626f48ae8376c6e71f91c55f9f389314d6f7a5453bd0f7c2e32dbc4f93b47435a6760d2ab2d848f9931bc9595d7101deb0b4a707c14201c366be01250"

RPROVIDES:${PN} += "cmake-Qt6Location \
pkgconfig-Qt6Location \
qt6-location-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Positioning \
cmake-Qt6PositioningQuick \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6QuickShapesPrivate \
libQt6Location6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6PositioningQuick"

inherit rpm
