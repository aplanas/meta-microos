SUMMARY = "Qt 6 WebSockets QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebSockets module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-websockets-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "21f63ff67104fce7557435cb3b5403b5a340ea43858fb495ca0b75864e6dab9f5a977bd2aa71dc6833ea0585c3c12f7d1c288714b3e8f360d60d4f3c17db02f0"

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
