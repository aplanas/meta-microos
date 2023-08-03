SUMMARY = "Qt6 WebEngineQuick library"
DESCRIPTION = "The Qt6 WebEngineQuick library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6WebEngineQuick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "332a43f2ea187dcb08e854f34b3b5407c8bed38c9fa66a22d87675acbb7d5bd8b661388b0adff38e806dcbe283350ebf3a3a305de7a4b77b5fe747148ecb9499"

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
