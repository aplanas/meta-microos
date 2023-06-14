SUMMARY = "Qt 6 SensorsQuick library"
DESCRIPTION = "The Qt6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6SensorsQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "036a907df12ed1cdd36d9665d2ef20cdcfb4f63cf4504639b2f9b5d697d1646e19d91534aa58eb03735a884804d53990e1c7e628e1232f4c5de6c07548dcb9c0"

RPROVIDES:${PN} += "libQt6SensorsQuick.so.6 \
libQt6SensorsQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6Sensors.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
