SUMMARY = "Development files for mosquitto"
DESCRIPTION = "Mosquitto is a message broker that implements the \
MQ Telemetry Transport protocol versions 3.1 and 3.1.1. MQTT provides a \
lightweight method of carrying out messaging using a publish/subscribe model. \
 \
This package holds the development files."
LICENSE = "EPL-1.0"

PV = "2.0.15"

RPM_NAME = "mosquitto-devel-2.0.15-1.5.aarch64.rpm"
RPM_HASH = "bf9cf4c1a0d6a1f910b4789511a52f0f12e532d61e06fd1e04b683945ffc0bcc543909e1ac8566cc1f2510c5a3f7875d4291bbbcaf71eb3d37732d9c6e7ecfab"

RPROVIDES:${PN} += "libmosquitto-devel \
libmosquittopp-devel \
mosquitto-devel \
pkgconfig-libmosquitto \
pkgconfig-libmosquittopp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmosquitto1 \
libmosquittopp1"

inherit rpm
