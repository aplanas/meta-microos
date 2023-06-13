SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickInput5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "121cd4e731b165e9df8a7258e30cb092ac1d664cb85d8fe5154835cfc94c2223a49e2da190208879d1a397299e7509986104c0c1da77c681b30c246a93ff4c8c"

RPROVIDES:${PN} += "libQt53DQuickInput.so.5()(64bit) \
libQt53DQuickInput.so.5(Qt_5)(64bit) \
libQt53DQuickInput5 \
libQt53DQuickInput5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DInput.so.5()(64bit) \
libQt53DInput.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Qml.so.5()(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
