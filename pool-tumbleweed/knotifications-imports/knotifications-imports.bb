SUMMARY = "KDE Desktop notifications - QML files"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. \
This package contains files that allow using knotification in QtQuick based \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knotifications-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "b44862c53b0c4c72686ee970fabecb244563d04e762d76593c1097174567ccbd02e70f8911d60cefe5e313f5b6c14a0aa0ef1228b54333ffec7deb0add1b8f78"

RPROVIDES:${PN} += "knotifications-imports \
libknotificationqmlplugin.so \
qt5qmlimport-org.kde.notification.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Notifications.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
