SUMMARY = "The BIRD Internet Routing Daemon"
DESCRIPTION = "BIRD is an implementation for routing Internet Protocol packets. IPv4 \
and IPv6 are supported by running separate daemons. It establishes \
multiple routing tables, and uses BGP, RIP, and OSPF routing \
protocols, as well as statically defined routes. \
 \
This package holds the IPv4+IPv6 binaries. \
 \
This package holds common files and directories."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.1"

RPM_NAME = "bird-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "f6e1c210460ba85fca7d74eca2ad1928a0d99d0383582da1ac2a2ced4aebe5b24087455e4b7c717e6a1459b324fdf533380a2f7ff7cc1edcbb3f52a874bee79e"

RPROVIDES:${PN} += "bird \
bird-common \
bird6 \
bird6-/usr/sbin/bird6 \
config-bird"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
