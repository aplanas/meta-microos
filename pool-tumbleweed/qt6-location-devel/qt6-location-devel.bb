SUMMARY = "Qt 6 Location library - Development files"
DESCRIPTION = "Development files for the Qt 6 Location library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "392a95560d40a96b889087865b7797e0eb183af1fee0ebaf9aa4dd506aa8f04037e2f6b345a333f8d1e3a62c53ea57785a118d45caf073f59eb532aa6f02dbb9"

RPROVIDES:${PN} += "cmake-Qt6Location \
pkgconfig-Qt6Location \
qt6-location-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6Positioning \
cmake-Qt6PositioningQuick \
cmake-Qt6QuickShapesPrivate \
libQt6Location6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Positioning \
pkgconfig-Qt6PositioningQuick \
qt6-quick-private-devel"

inherit rpm
