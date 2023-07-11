SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "bluez-qt-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "35ebb630f3ad5ed6318b8dd9eb0bf3ae5825e108b763c47f7b7e14aa0ef5979c578c36e30791f1d394e28ee7f462b1eab0185a551a6bef148cd900f0ad0e7c26"

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
