SUMMARY = "Library implementing the MQTT client"
DESCRIPTION = "The Paho MQTT C Client is a fully featured MQTT client written in ANSI standard C. \
C was chosen rather than C++ to maximize portability. A C++ API over this library is also available in Paho."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "1.3.12"

RPM_NAME = "libpaho-mqtt1-1.3.12-1.4.aarch64.rpm"
RPM_HASH = "26aef0a694cdb6fb7574ffee0fcafef3c99eb4fae60a4e1babb09b7e9ad5f00d173cd520d02fa7b93b5eb2960284c46ea79513a915d4b71acb75e5951c9db156"

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
