SUMMARY = "Network UPS Tools - Extra Networking Drivers (for Network Monitoring)"
DESCRIPTION = "Networking drivers for the Network UPS Tools. You will need them \
together with nut to provide UPS networking support. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-drivers-net-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "aef7d87861662909d7a1d101eb93deb28403eefb25e92f7b63fda1a7a88d1731dba5c3c44199982958fa39d476a57069973e6dcb5c173b47befd075c13628ae9"

RPROVIDES:${PN} += "nut-drivers-net"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libneon.so.27 \
libnetsnmp.so.40 \
nut"

inherit rpm
