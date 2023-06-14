SUMMARY = "Qt5 Positioning Library for Qt Quick"
DESCRIPTION = "This library contains glue code for using the Qt Location module in Qt Quick \
applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5PositioningQuick5-5.15.9+kde5-1.2.aarch64.rpm"
RPM_HASH = "e654966e7e46a4ff59b5092ebb0624d3e5648a6745391a4738d73c42e87e7c5f7562bab792d19a7419f54f79e0433f3266f8393ce4b8f4c8291af28ba7c5c031"

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
