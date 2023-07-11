SUMMARY = "Qt5 quickcontrols2 examples"
DESCRIPTION = "Examples for libqt5-qtquickcontrols2 module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde6"

RPM_NAME = "libqt5-qtquickcontrols2-examples-5.15.10+kde6-1.1.aarch64.rpm"
RPM_HASH = "142474f92edf696c3bd11141a5caaf2d171419a44d50afde5e28b7c8917f161b5132db3d13a5502883e97df1e9bc637f0bdabfd524dbcf2142160cfc368daa95"

RPROVIDES:${PN} += "libqt5-qtquickcontrols2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Controls.Imagine.2 \
qt5qmlimport-QtQuick.Controls.Material.2 \
qt5qmlimport-QtQuick.Controls.Universal.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
