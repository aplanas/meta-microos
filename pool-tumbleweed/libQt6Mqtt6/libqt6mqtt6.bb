SUMMARY = "Qt 6 MQTT library"
DESCRIPTION = "Qt library to implement MQTT protocol version 3.1 and 3.1.1"
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Mqtt6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "952d4560abefb4f5cad2a49ab3e33ff30193bb6f7c182a475bda383949be72d8a27f528a6f5505d8f86e212e6a74bd794fc12f8ce6bdb14af8e5c9a5a684e370"

RPROVIDES:${PN} += "libQt6Mqtt.so.6 \
libQt6Mqtt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
