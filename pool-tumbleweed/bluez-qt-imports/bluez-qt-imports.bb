SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "bluez-qt-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "18519d4db88057d5203a498f19d1e48538f1e90f79bdadeeaf4f54d94c55f093b2d68b4f9e60d043ba48c46350923402a815987ba1c4ab52bddfe1d506a883d8"

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
