SUMMARY = "Qt 5 Bluez Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Bluetooth5-imports-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "2b3f4705727931a23278de23d651fee2926270112a6722714ed0df9481ab9dd7d0e3ba11043a74556fb6c5ff15bd542294f37ddfe42ecee100d8ad453ae54768"

RPROVIDES:${PN} += "libQt5Bluetooth5-imports \
libQt5Bluetooth5-imports(aarch-64) \
libdeclarative_bluetooth.so()(64bit) \
qt5qmlimport(QtBluetooth.5)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Bluetooth.so.5()(64bit) \
libQt5Bluetooth.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQtQuick5 \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
