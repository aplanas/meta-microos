SUMMARY = "QML imports for the Qt 5 WebSockets library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde2"

RPM_NAME = "libQt5WebSockets5-imports-5.15.9+kde2-1.1.aarch64.rpm"
RPM_HASH = "ea3ed6e2f6c6aad85d3ce322ed6fd520a4ddc631554fba88c0b27ed2d8e0e5837c0c1cb3b1a33fb1804b5de37dc24e0ccfb9775ce99434b79ca1bf2a0a38c7f3"

RPROVIDES:${PN} += "libQt5WebSockets5-imports \
libQt5WebSockets5-imports(aarch-64) \
libdeclarative_qmlwebsockets.so()(64bit) \
qt5qmlimport(Qt.WebSockets.1) \
qt5qmlimport(QtWebSockets.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQtQuick5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
