SUMMARY = "Example programs for the Qt 5 Charts Library"
DESCRIPTION = "Examples for Qt5 Charts module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtcharts-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "b9b77c74fdd75197c35681675e169f748cfc96f9cb1718357bed4fe4f6b65d7c5b7dfdb0f49516e3f41c03d86eca072377a6712c8a594487a3156d1d20079e47"

RPROVIDES:${PN} += "libqt5-qtcharts-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Charts.so.5 \
libQt5Charts5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtCharts.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.XmlListModel.2"

inherit rpm
