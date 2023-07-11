SUMMARY = "QML imports for the Qt5 WebSockets library"
DESCRIPTION = "The module provides a JavaScript library for seamless integration of \
C++ and QML applications with HTML/JavaScript and QML clients."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde3"

RPM_NAME = "libQt5WebChannel5-imports-5.15.10+kde3-1.1.aarch64.rpm"
RPM_HASH = "cccf5cef51d0c26f5d2e1728ac371f9f97a6e44c8bae63b6c45c863258bf0f0a1acc754a3f47a851a929d1affe845af39c9fa4ff283ac8710af1957eaad2aa0f"

RPROVIDES:${PN} += "libQt5WebChannel5-imports \
libdeclarative-webchannel.so \
qt5qmlimport-QtWebChannel.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5WebChannel.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
