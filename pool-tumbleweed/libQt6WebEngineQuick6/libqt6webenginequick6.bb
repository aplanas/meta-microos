SUMMARY = "Qt6 WebEngineQuick library"
DESCRIPTION = "The Qt6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6WebEngineQuick6-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "6c536c66cfda939411690e82cf742592f23c2da8944a22dee2b2c4d2f883f2bc0cabdac013b2defe6cdd74e5ccfad87563261208f492491fc832769183c8b3e1"

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
