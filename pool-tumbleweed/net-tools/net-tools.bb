SUMMARY = "Important Programs for Networking"
DESCRIPTION = "This package contains programs for network administration and maintenance. \
Most of the utilities formerly contained in this package (netstat, arp, \
ifconfig, rarp, route) are obsoleted by the tools from iproute2 package (ip, ss) \
and have been moved to net-tools-deprecated."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "net-tools-2.10-2.1.aarch64.rpm"
RPM_HASH = "350396140a40526b08f4c2737d669a3ababa2d62e3ef264187d769a749b42030d18a914bf71be8405f91323080640d642c6753fadc731970d7332e33b815a710"

RPROVIDES:${PN} += "net-tools \
net-tools(aarch-64) \
net_tool"

RDEPENDS:${PN} += "hostname \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
