SUMMARY = "Qt 6 QmlCore library"
DESCRIPTION = "The Qt 6 QmlCore library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlCore6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "9f437e8f685544471776927a4752fcf26cab6d3e79bb185098381639ecc23f84156f60c684ed13055436e8031836d2beb5774e40fde1b868ae6f963ae5d18405"

RPROVIDES:${PN} += "libQt6QmlCore.so.6 \
libQt6QmlCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
