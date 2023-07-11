SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package, if you want to compile programs with qtsensors."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libqt5-qtconnectivity-devel-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "88f843bb6abfdc2d942cac4de408def82510705574f65a1e2d1677e69e4c5ac7033ea480a1e0c21709d89fa1136685ca70cab7ec3c7707d154114ad8c02aa8be"

RPROVIDES:${PN} += "cmake-Qt5Bluetooth \
cmake-Qt5Nfc \
libqt5-qtconnectivity-devel \
pkgconfig-Qt5Bluetooth \
pkgconfig-Qt5Nfc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Bluetooth5 \
libQt5Nfc5 \
pkgconfig-Qt5Core"

inherit rpm
