SUMMARY = "KDE Desktop notifications - QML files"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. \
This package contains files that allow using knotification in QtQuick based \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knotifications-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "e5867979c15fb6381fecfb991a3e9b5d35d309c312d107a8df8688f9a44296c021a5bde500a8dc7cb99cf72cefeec61f160c61828dbb0f86290dd8569faf4931"

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
