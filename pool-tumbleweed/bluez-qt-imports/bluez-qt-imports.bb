SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "bluez-qt-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5dadd91908c17b2ea91558894e4ec5b4ebf303238ddfb801afa0b29a4041662a579095a333b9121f07dea755fb61516d4a2046fea984e0bbe983586693a12d6d"

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
