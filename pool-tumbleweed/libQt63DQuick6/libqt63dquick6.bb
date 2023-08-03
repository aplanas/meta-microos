SUMMARY = "Qt 6 3DQuick library"
DESCRIPTION = "The Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt63DQuick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d99127a204fd6b81a92340a9da40880c53a1186f88490aaf5ee866f62fbb6c99177f11dabac403165cf693d1e6dce650b1fe7a0015564f8ee6e4e9577c6316b3"

RPROVIDES:${PN} += "libQt63DQuick.so.6 \
libQt63DQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
