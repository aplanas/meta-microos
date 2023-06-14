SUMMARY = "Qt wrapper around the ModemManager libraries"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "libKF5ModemManagerQt6-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "53b7ab19ea27daa41a2c91b459c532847b579a352ca2b19e3da9adeaa6a324a29ddbf95b6efcd3d3f6ac87be3969193c4ae6e5ef17457dac2dad8e0fd52301f0"

RPROVIDES:${PN} += "libKF5ModemManagerQt.so.6 \
libKF5ModemManagerQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
