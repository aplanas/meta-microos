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

RPROVIDES:${PN} += "gcompris \
gcompris-qt"

RDEPENDS:${PN} += "gcompris-qt-activities \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Multimedia5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sensors.so.5 \
libQt5Svg5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqt5-qtcharts-imports \
libqt5-qtgraphicaleffects \
libqt5-qtimageformats \
libstdc++.so.6 \
qml-box2d"

inherit rpm
