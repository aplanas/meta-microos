SUMMARY = "KDE Desktop notifications - QML files"
DESCRIPTION = "KNotification is used to notify the user of an event. It covers feedback and \
persistent events. \
This package contains files that allow using knotification in QtQuick based \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "knotifications-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "98edd68dc6395e294f1ba2e91607488bc433641ec13927d5ad6b7fee7e201723f470ecf862e23072312263006ca0f359fc2a2f0a964aa820c303c7fa37d68f42"

RPROVIDES:${PN} += "knotifications-imports \
knotifications-imports(aarch-64) \
libknotificationqmlplugin.so()(64bit) \
qt5qmlimport(org.kde.notification.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Notifications.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
