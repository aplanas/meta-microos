SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "bluez-qt-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "2d2e81a9d24ba3fdb9facb33dc4ab3629961e83223b63cd96a0d8a463da9e892c7d8ce22b2685822c260b7b3f8b9509ff550e9f76b270e0d04b4e06c9b324476"

RPROVIDES:${PN} += "bluez-qt-imports \
libbluezqtextensionplugin.so \
qt5qmlimport-org.kde.bluezqt.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5BluezQt.so.6 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQtQuick5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-org.kde.bluezqt.1"

inherit rpm
