SUMMARY = "Multiple Host Ping Library that supports ICMPv4 and ICMPv6"
DESCRIPTION = "liboping is a C library for measuring network latency using ICMP echo \
requests. It can send to and receive packets from multiple hosts in parallel, \
which is nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently for the programmer and user. \
 \
This package includes the header and shared library link, required for \
building applications or libraries that use liboping. \
This package is not needed at runtime."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "liboping-devel-1.10.0-1.20.aarch64.rpm"
RPM_HASH = "7aeecc3178dc7059c11266ef97c6002c1590da66129476b6105bab054e810ae7ae605f1393cc19eb30b8d1618ac776fc6730bd01b977520188d63ee67b96dad8"

RPROVIDES:${PN} += "liboping-devel \
pkgconfig-liboping"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboping"

inherit rpm
