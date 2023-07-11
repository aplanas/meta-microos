SUMMARY = "Shared C++ Library for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the shared C++ library."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "libmosquittopp1-2.0.15-1.5.aarch64.rpm"
RPM_HASH = "5ce1ffe9fa983b3f424d8e9ba31d707e160458b0a3da4d390505913f641f960669c682e7cbe1fe56a2dd210ee0bf9343767b83e6dbcfd2683f82390a66755886"

RPROVIDES:${PN} += "libmosquittopp.so.1 \
libmosquittopp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libmosquitto.so.1 \
libstdc++.so.6"

inherit rpm
