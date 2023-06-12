SUMMARY = "Multiactivity educational software for children aged 2–10 (Qt version)"
DESCRIPTION = "GCompris-Qt is an educational software suite comprising \
of numerous activities for children aged 2 to 10. Some of the \
activities are game orientated, but nonetheless still educational. \
 \
Currently, GCompris offers in excess of 100 activities. New \
activities can be added, and an activity can implement its own game \
scheme. \
 \
This version is a rewrite of GCompris using the QtQuick \
technology."
LICENSE = "AGPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "gcompris-qt-3.2-1.1.aarch64.rpm"
RPM_HASH = "54bda48560074ce84bc565c3c0bd1b6b054026908d5c43bd52321119e818b8de5fc3052365110ff39812588a8007d6c7710fa35bd12eb78d42b5fc47de15fbd3"

RPROVIDES:${PN} += "application() \
application(org.kde.gcompris.desktop) \
gcompris \
gcompris-qt \
gcompris-qt(aarch-64) \
metainfo() \
metainfo(org.kde.gcompris.appdata.xml)"
RDEPENDS:${PN} += "gcompris-qt-activities \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Multimedia5 \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Sensors.so.5()(64bit) \
libQt5Sensors.so.5(Qt_5)(64bit) \
libQt5Svg5 \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libqt5-qtcharts-imports \
libqt5-qtgraphicaleffects \
libqt5-qtimageformats \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qml-box2d"

inherit rpm