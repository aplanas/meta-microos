SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DAnimation5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "73be5ccffd63ba743ceea2724c550f9509695fe663066f398bd8c22b57208959151b98b7b2a9813f6c763fa6db0e4244b26de5c672e960dcc7656a09a50439dd"

RPROVIDES:${PN} += "libQt53DAnimation.so.5 \
libQt53DAnimation5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
