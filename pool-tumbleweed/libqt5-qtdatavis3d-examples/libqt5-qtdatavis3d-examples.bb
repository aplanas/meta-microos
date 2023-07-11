SUMMARY = "Examples for the Qt5 Data Visualization module"
DESCRIPTION = "This package provides examples for Qt 5 Data Visualization module."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtdatavis3d-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "b113163f414770267608cda6bac1a587ba19e653cff51439e290d8733d4990dc3d5c4cac4c653926cb38560cb75e97b72cb5bec47e593ad182ed6f6b6dacd5d1"

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
