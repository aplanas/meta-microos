SUMMARY = "Important Programs for Networking"
DESCRIPTION = "This package contains programs for network administration and maintenance. \
Most of the utilities formerly contained in this package (netstat, arp, \
ifconfig, rarp, route) are obsoleted by the tools from iproute2 package (ip, ss) \
and have been moved to net-tools-deprecated."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "net-tools-2.10-2.2.aarch64.rpm"
RPM_HASH = "7475c75dbeda1802f74303815552f28d5077c98159a3ee8034e439033048e67234242d3cc1394260953c9070702ceed65233f46b29bab905108dda34ae4f9698"

RPROVIDES:${PN} += "net-tool \
net-tools"

RDEPENDS:${PN} += "hostname \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
