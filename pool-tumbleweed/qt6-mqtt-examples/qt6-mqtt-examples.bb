SUMMARY = "Examples for the qt6-mqtt modules"
DESCRIPTION = "Examples for the qt6-mqtt modules."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-mqtt-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c873ee9b5045d4c8983ebf1c9e085b535c36024be514c6bbc005c7535f5d0207785c4d9d9b764be68a172ce00a2cbcaef56a74ed2bf2b101de26dc9eae6134ed"

RPROVIDES:${PN} += "qt6-mqtt-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Mqtt.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
