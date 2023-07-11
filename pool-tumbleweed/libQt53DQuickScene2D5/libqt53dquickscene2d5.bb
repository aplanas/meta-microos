SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickScene2D5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "0636608eeccf46711204cb9ed63569b98578555deda0a7478c62649c4199c0e85d2e308e6c25a66528ef9353db8a180c6e6332c9409ef4f368fb1b92b1dd3276"

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
