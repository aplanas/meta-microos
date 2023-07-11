SUMMARY = "Qt5 sensors examples"
DESCRIPTION = "Examples for libqt5-qtsensors module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtsensors-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d0cbda61f00aa3cfdb8a079490be61da9306a77a90cc7f68e3e82903ddbdd246d8657efae174bc071e3bc0ccaaba761894122934154cf722cc685794a399a58f"

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
