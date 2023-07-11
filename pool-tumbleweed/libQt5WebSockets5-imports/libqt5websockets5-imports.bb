SUMMARY = "QML imports for the Qt 5 WebSockets library"
DESCRIPTION = "The Qt WebSockets module provides C++ and QML interfaces that enable \
Qt applications to act as a server that can process WebSocket \
requests, or a client that can consume data received from the server, \
or both."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde2"

RPM_NAME = "libQt5WebSockets5-imports-5.15.10+kde2-1.1.aarch64.rpm"
RPM_HASH = "263518bfcaf9a7d0eb1d577cd57d10deb960cb85af1b978596bb3034763de182c611edc4be2e854314a96e19f79a2d62f511c781ac835d56f13970b5d113d84e"

RPROVIDES:${PN} += "libQt5WebSockets5-imports \
libdeclarative-qmlwebsockets.so \
qt5qmlimport-Qt.WebSockets.1 \
qt5qmlimport-QtWebSockets.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5WebSockets.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
