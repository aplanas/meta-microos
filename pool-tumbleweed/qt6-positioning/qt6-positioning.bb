SUMMARY = "Qt 6 Positioning plugins and libraries"
DESCRIPTION = "The Qt Positioning API provides positioning information via QML and C++ interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "00715c3701910797c55671097e421154e5d4ea6f8337231c31d962bc27c467b55f7202f6dd4811d38b71a54732c2f0c6ad2b1778c54a58eba1875104cc5d411e"

RPROVIDES:${PN} += "libqtposition_geoclue2.so()(64bit) \
libqtposition_geoclue2.so(Qt_6)(64bit) \
libqtposition_geoclue2.so(Qt_6.0)(64bit) \
libqtposition_geoclue2.so(Qt_6.1)(64bit) \
libqtposition_geoclue2.so(Qt_6.2)(64bit) \
libqtposition_geoclue2.so(Qt_6.3)(64bit) \
libqtposition_geoclue2.so(Qt_6.4)(64bit) \
libqtposition_geoclue2.so(Qt_6.5)(64bit) \
libqtposition_geoclue2.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtposition_nmea.so()(64bit) \
libqtposition_nmea.so(Qt_6)(64bit) \
libqtposition_nmea.so(Qt_6.0)(64bit) \
libqtposition_nmea.so(Qt_6.1)(64bit) \
libqtposition_nmea.so(Qt_6.2)(64bit) \
libqtposition_nmea.so(Qt_6.3)(64bit) \
libqtposition_nmea.so(Qt_6.4)(64bit) \
libqtposition_nmea.so(Qt_6.5)(64bit) \
libqtposition_nmea.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtposition_positionpoll.so()(64bit) \
libqtposition_positionpoll.so(Qt_6)(64bit) \
libqtposition_positionpoll.so(Qt_6.0)(64bit) \
libqtposition_positionpoll.so(Qt_6.1)(64bit) \
libqtposition_positionpoll.so(Qt_6.2)(64bit) \
libqtposition_positionpoll.so(Qt_6.3)(64bit) \
libqtposition_positionpoll.so(Qt_6.4)(64bit) \
libqtposition_positionpoll.so(Qt_6.5)(64bit) \
libqtposition_positionpoll.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-location \
qt6-positioning \
qt6-positioning(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Positioning.so.6()(64bit) \
libQt6Positioning.so.6(Qt_6)(64bit) \
libQt6SerialPort.so.6()(64bit) \
libQt6SerialPort.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
