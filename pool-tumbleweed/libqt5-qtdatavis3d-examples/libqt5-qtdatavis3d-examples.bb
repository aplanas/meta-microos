SUMMARY = "Examples for the Qt5 Data Visualization module"
DESCRIPTION = "This package provides examples for Qt 5 Data Visualization module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtdatavis3d-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "81bff5d353404210e760b0c272e22f4fabeedad5da9e65e55057389846493b87e452857934431b1b24dc575fa23fee670c6f39fd9d76b95f251b741f45c8014b"

RPROVIDES:${PN} += "libqt5-qtdatavis3d-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DataVisualization.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtDataVisualization.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
