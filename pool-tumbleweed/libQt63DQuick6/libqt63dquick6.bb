SUMMARY = "Qt 6 3DQuick library"
DESCRIPTION = "The Qt 6 3DQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuick6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8e2897dea58203cb627d63da338d8b29a3bc1477e05ba9999b0f97f6d80b1283b850192104be83d62add2cb9e1fbf7fcb36f2fe91b99a508ed47703560da8d96"

RPROVIDES:${PN} += "libQt63DQuick.so.6 \
libQt63DQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
