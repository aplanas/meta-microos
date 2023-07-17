SUMMARY = "Qt 6 connectivity libraries - Development files"
DESCRIPTION = "Development files for the Qt6 connectivity libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9a9ea78a527ec8b4a3ae10108e9fcad2bb6fd9b0465c8aafc1112834c8c50e09dc61f95c469c715ecdd0fcc0e7f906607b99ce9941a1f76e694d74a4b285cf81"

RPROVIDES:${PN} += "cmake-Qt6Bluetooth \
cmake-Qt6Nfc \
pkgconfig-Qt6Bluetooth \
pkgconfig-Qt6Nfc \
qt6-connectivity-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6DBus \
cmake-Qt6Network \
libQt6Bluetooth6 \
libQt6Nfc6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6DBus \
pkgconfig-Qt6Network \
qt6-connectivity"

inherit rpm
