SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Nfc5-imports-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "547c5243965ee400b65bc597da8f5233315364168a90dcc52824ae31653f038e020008856fc1abf5fae63a719f687f3ec1140a14e8c57394d21fbd8827c3a3bb"

RPROVIDES:${PN} += "libQt5Nfc5-imports \
libdeclarative-nfc.so \
qt5qmlimport-QtNfc.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Nfc.so.5 \
libQt5Qml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
