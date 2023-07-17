SUMMARY = "Qt 6 Location library - Development files"
DESCRIPTION = "Development files for the Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "191fe392bb47de9ff711765f891df20102e09f4fcc01f27346dac59debaca14f2a0888fe0a324dce2908b2c44ba85e4a91d5a2f2afc5fae813137ae0fc14e820"

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
