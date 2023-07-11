SUMMARY = "Development files for MQTT C Client library"
DESCRIPTION = "Development files for the the Paho MQTT C Client."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "1.3.12"

RPM_NAME = "libpaho-mqtt-devel-1.3.12-1.4.aarch64.rpm"
RPM_HASH = "15fcfdd5bb8c557ffd0bbe8ab84c473bcbcd41c8f7b5e040152813142c5fc944f022587dbcb0d486822885b612768ecae52b53fdd4b0437fb0b9798997d08591"

RPROVIDES:${PN} += "cmake-eclipse-paho-mqtt-c \
libpaho-mqtt-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpaho-mqtt1"

inherit rpm
