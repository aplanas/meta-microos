SUMMARY = "Qt 6 SensorsQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensorsquick-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e70df90cf08f5f7a048a45e471ea64b9a034bb3cebeaad02739a056e033c199c7d91e07a89e2868c6f675b66b8e8a14bca3665147aa5148ddc08add1cc3d8072"

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
