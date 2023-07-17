SUMMARY = "Qt 6 QmlCore library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcore-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "676783c6eedd95fdc9e7a83e54584df83c387e4f549e63dfdfd41fbf30c86449caa4613e374eb16ab6d3e40b1a7d023066071a084e3c1366910790ecb37d3dc5"

RPROVIDES:${PN} += "cmake-Qt6QmlCore \
pkgconfig-Qt6QmlCore \
qt6-qmlcore-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6QmlCore6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Qml"

inherit rpm
