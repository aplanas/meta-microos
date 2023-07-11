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

RPM_NAME = "liboping-devel-1.10.0-1.19.aarch64.rpm"
RPM_HASH = "95f1b9c1f78c00148b96f0137404efba80bc27c12d45291be70bb7b6e3ec7a9e205cd2bde75e9603024d0e6fa7455f841606c6eedb49879f4a1af3ae1156b90c"

RPROVIDES:${PN} += "liboping-devel \
pkgconfig-liboping"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboping"

inherit rpm
