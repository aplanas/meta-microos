SUMMARY = "Qt6 WebEngineQuick library"
DESCRIPTION = "The Qt6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "addc6024d88d650928f1984252d2be65a9758455e32ccf3358450e63cd7ca8b735efb6b974b693a5902c3d3bf540df3d82d26411abe62d1669adc323824a3f0e"

RPROVIDES:${PN} += "libQt6WebEngineQuick.so.6 \
libQt6WebEngineQuick6 \
libQt6WebEngineQuickDelegatesQml.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-webengine-imports"

inherit rpm
