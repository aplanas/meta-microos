SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickScene2D5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "79f4f2a68e81e4d7dd20880568d49f2475c4a6cf581697549d9fd3d300a1ba2c3b0cdc4d585563c7e6e4e00fa664523752d42fc35e6b1f235d07baa4a7d1442d"

RPROVIDES:${PN} += "libQt53DQuickScene2D.so.5 \
libQt53DQuickScene2D5 \
libscene2d.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
