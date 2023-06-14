SUMMARY = "Qt 6 Positioning plugins and libraries"
DESCRIPTION = "The Qt Positioning API provides positioning information via QML and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "00715c3701910797c55671097e421154e5d4ea6f8337231c31d962bc27c467b55f7202f6dd4811d38b71a54732c2f0c6ad2b1778c54a58eba1875104cc5d411e"

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
