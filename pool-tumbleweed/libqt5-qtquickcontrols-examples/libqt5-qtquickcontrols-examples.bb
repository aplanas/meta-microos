SUMMARY = "Qt5 quickcontrols examples"
DESCRIPTION = "Examples for libqt5-qtquickcontrols module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtquickcontrols-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d3d088ba7a00bf62a7a3e80887950065853869fb9cc611c94fd21e4fd797d9639e08e9afbfa2455a14183988831721cf813a5af9e3cbf8652845014b5ca27429"

RPROVIDES:${PN} += "libqt5-qtquickcontrols-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Controls.Styles.Flat.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Extras.1 \
qt5qmlimport-QtQuick.Extras.Private.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Particles.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtQuick.XmlListModel.2"

inherit rpm
