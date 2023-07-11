SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libQt5Nfc5-imports-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "c00cfcf7c3c6e211f999ecfe3e70b35999e3690a8fe79291b559dbc4277e78c51e3ec389fe29c482ab9fa6d5d8fe80a412a875640ed21db3c2f9d9e500392e93"

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
