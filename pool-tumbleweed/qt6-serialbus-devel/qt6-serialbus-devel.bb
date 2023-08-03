SUMMARY = "Qt 6 SerialBus library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialbus-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e43cdefd19ba1d46ea987510b1fbd6b98d1325efaaef89627591c306e7341f0a954d599b60c34c0ad514570f96ef12166b92c9e34a61b79059e4d29d1572d21d"

RPROVIDES:${PN} += "cmake-Qt6SerialBus \
pkgconfig-Qt6SerialBus \
qt6-serialbus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6SerialPort \
libQt6SerialBus6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6SerialPort \
qt6-serialbus"

inherit rpm
