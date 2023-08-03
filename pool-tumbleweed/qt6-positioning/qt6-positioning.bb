SUMMARY = "Qt 6 Positioning plugins and libraries"
DESCRIPTION = "The Qt Positioning API provides positioning information via QML and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioning-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e4b67a6eae02882f6033d74301f46b1ee4c79c3c12f33f93e3bc312a32032ecbff6edeb295c562e4bc094b848f151e34d7882a058762eab5103068fed903382d"

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
