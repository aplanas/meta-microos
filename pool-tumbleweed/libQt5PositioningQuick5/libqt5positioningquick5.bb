SUMMARY = "Qt5 Positioning Library for Qt Quick"
DESCRIPTION = "This library contains glue code for using the Qt Location module in Qt Quick \
applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5PositioningQuick5-5.15.9+kde5-1.2.aarch64.rpm"
RPM_HASH = "e654966e7e46a4ff59b5092ebb0624d3e5648a6745391a4738d73c42e87e7c5f7562bab792d19a7419f54f79e0433f3266f8393ce4b8f4c8291af28ba7c5c031"

RPROVIDES:${PN} += "libQt5PositioningQuick.so.5()(64bit) \
libQt5PositioningQuick.so.5(Qt_5)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.0)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.1)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.10)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.11)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.12)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.13)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.14)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.15)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.2)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.3)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.4)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.5)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.6)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.7)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.8)(64bit) \
libQt5PositioningQuick.so.5(Qt_5.9)(64bit) \
libQt5PositioningQuick5 \
libQt5PositioningQuick5(aarch-64) \
libdeclarative_positioning.so()(64bit) \
qt5qmlimport(QtPositioning.5)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
