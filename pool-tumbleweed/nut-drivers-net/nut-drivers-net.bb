SUMMARY = "Network UPS Tools - Extra Networking Drivers (for Network Monitoring)"
DESCRIPTION = "Networking drivers for the Network UPS Tools. You will need them \
together with nut to provide UPS networking support. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-drivers-net-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "196768cc285b9fe58101434b6a489f3477bc102f7b34c3179190ca5d9de054846a919a2640ba450a9c17cc6df582408c08cbb5e4d8191ad93be9beeb5dc49e1a"

RPROVIDES:${PN} += "nut-drivers-net"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libneon.so.27 \
libnetsnmp.so.40 \
nut"

inherit rpm
