SUMMARY = "Development files for libdnet"
DESCRIPTION = "libdnet provides a portable interface to several low-level \
networking routines, including: \
- network address manipulation \
- kernel arp(4) cache and route(4) table lookup and manipulation \
- network firewalling (IP filter, ipfw, ipchains, pf, PktFilter, ...) \
- network interface lookup and manipulation \
- IP tunnelling (BSD/Linux tun, Universal TUN/TAP device) \
- raw IP packet and Ethernet frame transmission"
LICENSE = "BSD-3-Clause"

PV = "1.16.4"

RPM_NAME = "libdnet-devel-1.16.4-1.1.aarch64.rpm"
RPM_HASH = "b8a725cadfcec1c62da0e6df733ac6d9df6f7c9b0bf4495f3f54fc6cdbe011372dadb63763111dbee0f82c2e1ea9cf5f49048fdd0e6e2ab47faf67cf76c5c8d6"

RPROVIDES:${PN} += "libdnet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
libdnet1"

inherit rpm
