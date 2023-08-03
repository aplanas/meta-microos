SUMMARY = "Qt 6 WebSockets QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebSockets module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-websockets-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "59ba62d1a1f861094a33b93fcbec4ec85a7704f6563b7d6516624a704821a2b6659bb78c627c5dbb1f44f2620025f087a60eae99f78c0c82f75ce7e465ff20ab"

RPROVIDES:${PN} += "libqmlwebsocketsplugin.so \
qt6-websockets-imports \
qt6qmlimport-QtWebSockets.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
