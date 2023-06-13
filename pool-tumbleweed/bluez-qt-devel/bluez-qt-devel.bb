SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Development files for QBluez Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "bluez-qt-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a85b1de1afa05ba49a08fe62a06e412fbd6b366b8a7e288d7f6c80e2013d47ef2d419953459c7d0ef19b49002c2e43f8750cdebdc25905022e547d50b9250954"

RPROVIDES:${PN} += "bluez-qt-devel \
bluez-qt-devel(aarch-64) \
cmake(KF5BluezQt) \
pkgconfig(KF5BluezQt)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt5Core) \
libKF5BluezQt6 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5DBus) \
pkgconfig(Qt5Network)"

inherit rpm
