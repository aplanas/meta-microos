SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DAnimation5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "e83b0bc3f21248eaf7c9937ec0afc9b4da9895db022326ce3e73313e4510e4e173910ed948a56a3af75244ed02d3cc7470c22b3b52c2b2ae6a985240b936aa74"

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
