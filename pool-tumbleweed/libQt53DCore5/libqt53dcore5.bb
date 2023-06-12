SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D provides functionality for near-realtime simulation \
systems with support for 2D and 3D rendering in both Qt C++ and Qt Quick applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DCore5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "2bb28d7927afa12304762b47ece4a66ec6f40f42d43b91230ef8a432e8479e3c81f4080d1967541e842f56080fb15c6ae0f4a4426c0b2b91092f016a7f875643"

RPROVIDES:${PN} += "libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DCore.so.5(Qt_5.0)(64bit) \
libQt53DCore.so.5(Qt_5.1)(64bit) \
libQt53DCore.so.5(Qt_5.10)(64bit) \
libQt53DCore.so.5(Qt_5.11)(64bit) \
libQt53DCore.so.5(Qt_5.12)(64bit) \
libQt53DCore.so.5(Qt_5.13)(64bit) \
libQt53DCore.so.5(Qt_5.14)(64bit) \
libQt53DCore.so.5(Qt_5.15)(64bit) \
libQt53DCore.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt53DCore.so.5(Qt_5.2)(64bit) \
libQt53DCore.so.5(Qt_5.3)(64bit) \
libQt53DCore.so.5(Qt_5.4)(64bit) \
libQt53DCore.so.5(Qt_5.5)(64bit) \
libQt53DCore.so.5(Qt_5.6)(64bit) \
libQt53DCore.so.5(Qt_5.7)(64bit) \
libQt53DCore.so.5(Qt_5.8)(64bit) \
libQt53DCore.so.5(Qt_5.9)(64bit) \
libQt53DCore5 \
libQt53DCore5(aarch-64) \
libQt53dCollision5"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
