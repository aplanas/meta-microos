SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Development files for QBluez Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "bluez-qt-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9bbda36de2958b27b61cc107376a56f75524c8d3d16b2a84584c1fa600a6f5dff1ccd15df799bf7614c5886cb8421e198af09ebc76c9116fffc6e71cd6693781"

RPROVIDES:${PN} += "bluez-qt-devel \
cmake-KF5BluezQt \
pkgconfig-KF5BluezQt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
libKF5BluezQt6 \
pkgconfig-Qt5Core \
pkgconfig-Qt5DBus \
pkgconfig-Qt5Network"

inherit rpm
