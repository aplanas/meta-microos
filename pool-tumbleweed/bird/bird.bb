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

PV = "2.13"

RPM_NAME = "bird-2.13-1.1.aarch64.rpm"
RPM_HASH = "612245bf39c3c413c63d4a77571ca503bdcf2a4d58834b1179b8b094d659fc61548448516b1e425fd0e38024041df977d4b9a1257e4146ea5deb97fd3b6ff2ec"

RPROVIDES:${PN} += "bird \
bird(aarch-64) \
bird-common \
bird6 \
bird6:/usr/sbin/bird6 \
config(bird)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
