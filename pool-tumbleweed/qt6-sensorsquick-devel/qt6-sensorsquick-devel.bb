SUMMARY = "Qt 6 SensorsQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensorsquick-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "063739307e1940a2ae76ec6111096aee195ccdcfdeb56fe95703ca2800d5403a9ebe5c377b4094729d38f4c3923b061f34b848371f7672433a2954292fce88a0"

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
