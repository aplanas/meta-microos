SUMMARY = "KDE Desktop notifications - QML files"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. \
This package contains files that allow using knotification in QtQuick based \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knotifications-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5024690e7e4447051a7fdc61b6fa6541788b4e7ad11f5e5e197ccb681620a394b5c511624dd0a9131aaad779f0dbd7c6c83ab3f8c78059e09b0dc521712eedce"

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
