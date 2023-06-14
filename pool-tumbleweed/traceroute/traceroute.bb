SUMMARY = "Packet route path tracing utility"
DESCRIPTION = "Traceroute tracks the route packets taken from an IP network on their way to a given host. \
It utilizes the IP protocol's time to live (TTL) field and attempts to elicit an ICMP TIME_EXCEEDED \
response from each gateway along the path to the host."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "traceroute-2.1.2-1.2.aarch64.rpm"
RPM_HASH = "3f0d87ea9d5de3bfab3dc9c05d2634ac4cf60d6bffa5dd69107df04e7f77edef00b36cc0d0ce1c1f0e71980a61e1b74966ac0e2f89a32fb8a81ce2b8848f2dd2"

RPROVIDES:${PN} += "net-tools-/usr/sbin/traceroute \
tcptraceroute \
traceroute"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
