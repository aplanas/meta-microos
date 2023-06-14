SUMMARY = "Library implementing the MQTT client"
DESCRIPTION = "The Paho MQTT C Client is a fully featured MQTT client written in ANSI standard C. \
C was chosen rather than C++ to maximize portability. A C++ API over this library is also available in Paho."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "1.3.12"

RPM_NAME = "libpaho-mqtt1-1.3.12-1.3.aarch64.rpm"
RPM_HASH = "bf319f6afbb24d29966fb802ba8122be4435d6a47c3d731029c5cc4b387733b85c13dd13e0c1c57a0a682286c98c5a495594d294fa94275002e8e2a89dc65f99"

RPROVIDES:${PN} += "libpaho-mqtt1 \
libpaho-mqtt3a.so.1 \
libpaho-mqtt3as.so.1 \
libpaho-mqtt3c.so.1 \
libpaho-mqtt3cs.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
