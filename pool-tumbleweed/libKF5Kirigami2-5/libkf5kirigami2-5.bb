SUMMARY = "Set of QtQuick components"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Based on Qt Quick Controls 2. This package contains the base shared libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Kirigami2-5-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "36e622ef88e02d29a610a3f4c96c2a2c8bb0d71ffa70eee101c6a042609e8c8a30e0afa6b4f25d6732f33e046f2c457e8c3d3296b74a0df044c755199bdafd32"

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
