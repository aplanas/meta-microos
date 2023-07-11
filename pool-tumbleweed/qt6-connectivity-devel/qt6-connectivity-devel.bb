SUMMARY = "Qt 6 connectivity libraries - Development files"
DESCRIPTION = "Development files for the Qt6 connectivity libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-connectivity-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "8d20c4fcfedfc2e9c43c76e5fa0e744ecdde94e6703da04d574fd5f8654817da9793367853ce6f2cf84ac53831a29a0f30e3c94d4f73bed121837a326f745b72"

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
