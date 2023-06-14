SUMMARY = "Qt5 sensors examples"
DESCRIPTION = "Examples for libqt5-qtsensors module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtsensors-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "85d8722fc10c170a55508e800cb78d022591ae431385c483d6ab48188af86d38d262a14cfbf1dd3c1ae3697f2e6c80a222c2b9927c36fe1d7b473390c6e3095c"

RPROVIDES:${PN} += "libdeclarative-explorer.so \
libdeclarative-grue.so \
libgruesensor.so.1 \
libqt5-qtsensors-examples \
libqtsensors-grue.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sensors.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtSensors.5"

inherit rpm
