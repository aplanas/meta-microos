SUMMARY = "Qt 6 SensorsQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-sensorsquick-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b658cada5e092edb4f0095a5c173dbce8da2d804850dfda422eb58cfce6c72bff9e9c44cae1b0febee81692dd6077f2da274aaf2bb530fa55785f39e74640a6a"

RPROVIDES:${PN} += "cmake-Qt6SensorsQuick \
pkgconfig-Qt6SensorsQuick \
qt6-sensorsquick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
cmake-Qt6Sensors \
libQt6SensorsQuick6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Sensors"

inherit rpm
