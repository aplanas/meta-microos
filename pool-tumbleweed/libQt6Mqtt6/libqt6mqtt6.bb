SUMMARY = "Qt 6 MQTT library"
DESCRIPTION = "Qt library to implement MQTT protocol version 3.1 and 3.1.1"
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Mqtt6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "952d4560abefb4f5cad2a49ab3e33ff30193bb6f7c182a475bda383949be72d8a27f528a6f5505d8f86e212e6a74bd794fc12f8ce6bdb14af8e5c9a5a684e370"

RPROVIDES:${PN} += "libQt6Mqtt.so.6()(64bit) \
libQt6Mqtt.so.6(Qt_6)(64bit) \
libQt6Mqtt.so.6(Qt_6.0)(64bit) \
libQt6Mqtt.so.6(Qt_6.1)(64bit) \
libQt6Mqtt.so.6(Qt_6.2)(64bit) \
libQt6Mqtt.so.6(Qt_6.3)(64bit) \
libQt6Mqtt.so.6(Qt_6.4)(64bit) \
libQt6Mqtt.so.6(Qt_6.5)(64bit) \
libQt6Mqtt.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Mqtt6 \
libQt6Mqtt6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
