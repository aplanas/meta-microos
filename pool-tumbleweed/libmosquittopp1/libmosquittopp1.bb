SUMMARY = "Shared C++ Library for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the shared C++ library."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "libmosquittopp1-2.0.15-1.4.aarch64.rpm"
RPM_HASH = "6f329fe13c0f02ebab55eeb4b74b217aacdc0193604ff12739061b24b231b9a48ec3890f96e35f235bb5d705cd9d8447ca7ba709909c1f731ee743f145dd1971"

RPROVIDES:${PN} += "libmosquittopp.so.1()(64bit) \
libmosquittopp1 \
libmosquittopp1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libmosquitto.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
