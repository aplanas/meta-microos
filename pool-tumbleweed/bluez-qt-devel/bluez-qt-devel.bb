SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Development files for QBluez Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "bluez-qt-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "752307d1d796df0546413b49143448205305c2b87665314d038e6e56adf01e637c9a0470150fa1a94caa0b388f118d2f09bb686ed255e1111e3e4a84d666bddb"

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
