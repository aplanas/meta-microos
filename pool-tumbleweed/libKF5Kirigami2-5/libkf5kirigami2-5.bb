SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Based on Qt Quick Controls 2. This package contains the base shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Kirigami2-5-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "5795b7a28c6a0cfa9c49c58b3258ebe7a1ef52807867540732b7cbb754a5062e5b459d8cf45a788fb24518f9b5f8a310169e0fdbdad8dd1bfab8053d01ef215e"

RPROVIDES:${PN} += "libKF5Kirigami2-5 \
libKF5Kirigami2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
