SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Based on Qt Quick Controls 2. This package contains the base shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Kirigami2-5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "993a32904ca9c119d71572f96900569ce29be1b6aa3409e3ec926508075087bb4c782d412cc81bda2589d9498fc355d2e99fbe35ce1a3c5a676cdcc02d251667"

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
