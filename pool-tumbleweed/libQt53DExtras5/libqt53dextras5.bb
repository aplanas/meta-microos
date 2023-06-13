SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DExtras5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "4e65c8606e9ada4da0f53d363848a947965f2faaf7750f5a68fca5117da8935fd2008ec819f0e6ea8873a6ea5cc371a4bec8d9d296a8b3f3c3d8b180516ca667"

RPROVIDES:${PN} += "libQt53DExtras.so.5()(64bit) \
libQt53DExtras.so.5(Qt_5)(64bit) \
libQt53DExtras5 \
libQt53DExtras5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DInput.so.5()(64bit) \
libQt53DInput.so.5(Qt_5)(64bit) \
libQt53DLogic.so.5()(64bit) \
libQt53DLogic.so.5(Qt_5)(64bit) \
libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
