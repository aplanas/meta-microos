SUMMARY = "Development files for MQTT C Client library"
DESCRIPTION = "Development files for the the Paho MQTT C Client."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "1.3.12"

RPM_NAME = "libpaho-mqtt-devel-1.3.12-1.3.aarch64.rpm"
RPM_HASH = "019245f67f35d103f4bbd218425e234d31f699d8cc83a85a430e0e11cbdc70b6cdd56e71864ac9f883a726d82cc218c4ab479af99dfd09518f25985c3aa1416c"

RPROVIDES:${PN} += "cmake(eclipse-paho-mqtt-c) \
libpaho-mqtt-devel \
libpaho-mqtt-devel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpaho-mqtt1"

inherit rpm
