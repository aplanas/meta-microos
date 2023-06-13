SUMMARY = "Qt5 Data Visualization module"
DESCRIPTION = "Qt Data Visualization module provides a way to visualize data in 3D. \
 \
This package contains a shared library for the QtDataVisualization."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libQt5DataVisualization5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "6597be67474157765f0fc23075262969a68873f3a20554f759ef037396b8aa0ff722ebca725e14a0a89a449a77033d1ef3c292d9f267eef77cc3c88fd34f9c5a"

RPROVIDES:${PN} += "libQt5DataVisualization.so.5()(64bit) \
libQt5DataVisualization.so.5(Qt_5)(64bit) \
libQt5DataVisualization5 \
libQt5DataVisualization5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
