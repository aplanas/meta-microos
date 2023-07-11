SUMMARY = "Qt5 location examples"
DESCRIPTION = "Examples for libqt5-qtlocation module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde4"

RPM_NAME = "libqt5-qtlocation-examples-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "f412857d6db43fdc6d81b83a443149c5459cb072da6a92332308cadc48e1636b6d36297212d5c336e72b96ca57148948bf6d80247b6d2c2dccf34a330e016463"

RPROVIDES:${PN} += "libqt5-qtlocation-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Location.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.location.1 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-Qt.labs.qmlmodels.1 \
qt5qmlimport-QtLocation.5 \
qt5qmlimport-QtPositioning.5 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
