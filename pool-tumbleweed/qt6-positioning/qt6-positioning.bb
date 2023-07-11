SUMMARY = "Qt 6 Positioning plugins and libraries"
DESCRIPTION = "The Qt Positioning API provides positioning information via QML and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7f383c8c12b3826f5b9b758f62ce9bbd960f4027385c40f94553168a10c81a951233898622910af7ba189222dc18abf114e11a981da9bd15c3b70a22f1985979"

RPROVIDES:${PN} += "libqtposition-geoclue2.so \
libqtposition-nmea.so \
libqtposition-positionpoll.so \
qt6-location \
qt6-positioning"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6SerialPort.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
