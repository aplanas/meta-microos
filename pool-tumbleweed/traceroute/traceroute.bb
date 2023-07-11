SUMMARY = "Packet route path tracing utility"
DESCRIPTION = "Traceroute tracks the route packets taken from an IP network on their way to a given host. \
It utilizes the IP protocol's time to live (TTL) field and attempts to elicit an ICMP TIME_EXCEEDED \
response from each gateway along the path to the host."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "traceroute-2.1.2-1.3.aarch64.rpm"
RPM_HASH = "df4472850c72be8e30e60e06570f53567e4041776638ee37e84b520f72973d8f97f36308c31883bde602fc58206046c5107cb48fe62f9b767bdb438852a64817"

RPROVIDES:${PN} += "net-tools-/usr/sbin/traceroute \
tcptraceroute \
traceroute"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
