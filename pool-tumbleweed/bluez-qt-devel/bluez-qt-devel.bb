SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Development files for QBluez Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "bluez-qt-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "9f9bc2d0aa9d50004eb664dd5b9b7f27a296cf28b5ce164502e3add0119c8b780bc1692d7c28237a4519b5892961ee4fc87e0129c28254f542ee6dae5997cfd2"

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
