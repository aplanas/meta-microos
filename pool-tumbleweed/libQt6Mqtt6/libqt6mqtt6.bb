SUMMARY = "Qt 6 MQTT library"
DESCRIPTION = "Qt library to implement MQTT protocol version 3.1 and 3.1.1"
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "libQt6Mqtt6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "48da29269881ece9d03d6bd63856eaea871fe8978ea92404969c19369028b0188915d59f37dc4c0536694ecd0267b54ac7c04c228d7818cfe6eb664f79a071a2"

RPROVIDES:${PN} += "libQt6Mqtt.so.6 \
libQt6Mqtt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
