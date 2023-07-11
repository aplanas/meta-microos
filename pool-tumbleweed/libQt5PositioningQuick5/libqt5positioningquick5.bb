SUMMARY = "Qt5 Positioning Library for Qt Quick"
DESCRIPTION = "This library contains glue code for using the Qt Location module in Qt Quick \
applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libQt5PositioningQuick5-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "c6015442417419543e6d90a5542f27f7218b150a8f775d02ba2c6f2121358a0ae2eef00cab3db546aafd14277a089437c84f79b8e17c444139a85f395d632bec"

RPROVIDES:${PN} += "libQt5PositioningQuick.so.5 \
libQt5PositioningQuick5 \
libdeclarative-positioning.so \
qt5qmlimport-QtPositioning.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
