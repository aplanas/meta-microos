SUMMARY = "Qt 6 WebSockets QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebSockets module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-websockets-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "21f63ff67104fce7557435cb3b5403b5a340ea43858fb495ca0b75864e6dab9f5a977bd2aa71dc6833ea0585c3c12f7d1c288714b3e8f360d60d4f3c17db02f0"

RPROVIDES:${PN} += "libqmlwebsocketsplugin.so()(64bit) \
libqmlwebsocketsplugin.so(Qt_6)(64bit) \
libqmlwebsocketsplugin.so(Qt_6.0)(64bit) \
libqmlwebsocketsplugin.so(Qt_6.1)(64bit) \
libqmlwebsocketsplugin.so(Qt_6.2)(64bit) \
libqmlwebsocketsplugin.so(Qt_6.3)(64bit) \
libqmlwebsocketsplugin.so(Qt_6.4)(64bit) \
libqmlwebsocketsplugin.so(Qt_6.5)(64bit) \
libqmlwebsocketsplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-websockets-imports \
qt6-websockets-imports(aarch-64) \
qt6qmlimport(QtWebSockets.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6WebSockets.so.6()(64bit) \
libQt6WebSockets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
