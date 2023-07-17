SUMMARY = "Qt 6 Positioning plugins and libraries"
DESCRIPTION = "The Qt Positioning API provides positioning information via QML and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "249e5fa29417d753c915c87a9a1adf24e699062ccd8fbc344dd39a8c98945ef9975e116e16ca54addefd38413d0078a7ac596d86bee270e7a69a3085d47ce502"

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
