SUMMARY = "MathGL window library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-wnd8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "973e620eb75c9a32d437b1cefb87eb04784901a51c07fff23edbd802cb7c1c9112d92d75fef8ebbaef3d8c3f77b42d2d9f08c9da368320f1dc1c122979ba0d91"

RPROVIDES:${PN} += "libmgl-wnd.so.8 \
libmgl-wnd8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
