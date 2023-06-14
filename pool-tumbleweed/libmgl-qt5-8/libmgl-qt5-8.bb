SUMMARY = "MathGL Qt5 widget library"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "libmgl-qt5-8-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "a0d1143e8face78dbf588a8a1569ccc91aafc5e574f35dd976511e067f24fd926238ac81af72e949d6e1f1695744e91cd3abac65d37ecb9022767373e0d93ab2"

RPROVIDES:${PN} += "libmgl-qt5-8 \
libmgl-qt5.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
