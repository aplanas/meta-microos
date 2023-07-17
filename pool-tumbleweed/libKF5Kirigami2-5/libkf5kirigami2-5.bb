SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Based on Qt Quick Controls 2. This package contains the base shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Kirigami2-5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "91b758fa3a1bcef745ed68c2e2d95694c70bc065c24ae9800941dcc949ad22640f32d9c64326f7281b72037e29f5de8da5f9e4385f5c9cb0b284bd57dbe1dc29"

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
