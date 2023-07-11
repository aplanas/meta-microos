SUMMARY = "Qt 5 Bluez Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libQt5Bluetooth5-imports-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "1aff2323d494cef7186be3e2463a6a8eaa8fc83d982a2144d841964c8aadde7f8c6c57f84d28dc2aa5ed94b67e23d02b22038f622f0e7ceda0340b1e19e71610"

RPROVIDES:${PN} += "libQt5Bluetooth5-imports \
libdeclarative-bluetooth.so \
qt5qmlimport-QtBluetooth.5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Bluetooth.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
