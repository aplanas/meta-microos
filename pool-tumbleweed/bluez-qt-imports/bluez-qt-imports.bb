SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "bluez-qt-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2d2e81a9d24ba3fdb9facb33dc4ab3629961e83223b63cd96a0d8a463da9e892c7d8ce22b2685822c260b7b3f8b9509ff550e9f76b270e0d04b4e06c9b324476"

RPROVIDES:${PN} += "bluez-qt-imports \
bluez-qt-imports(aarch-64) \
libbluezqtextensionplugin.so()(64bit) \
qt5qmlimport(org.kde.bluezqt.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5BluezQt.so.6()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQtQuick5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(org.kde.bluezqt.1)"

inherit rpm
