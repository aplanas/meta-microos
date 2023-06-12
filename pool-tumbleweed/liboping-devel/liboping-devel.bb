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

RPM_NAME = "liboping-devel-1.10.0-1.18.aarch64.rpm"
RPM_HASH = "7a6d40c1d651e2dc6fba6a440ae70fcf697ccb69e703524194c0a24869abf0debb9e5bec72adb3bd2b880b52d985e9c5f5d7715edda02208e2080c7f0d9679c3"

RPROVIDES:${PN} += "liboping-devel \
liboping-devel(aarch-64) \
pkgconfig(liboping)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboping"

inherit rpm
