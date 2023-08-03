SUMMARY = "Qt 6 connectivity libraries - Development files"
DESCRIPTION = "Development files for the Qt6 connectivity libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-connectivity-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7fdd7cd70fbb31b2cad300d143f0b4778268cbaa68ce58d4cebf04795290746b35b4f8b12d091993c55ee106bdf917d4473554dd064148ef96cc36c115c0d8a5"

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
