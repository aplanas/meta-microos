SUMMARY = "VPN adapter for Tor and I2P"
DESCRIPTION = "OnionCat creates a transparent IP layer on top of Tor's hidden services. It \
transmits any kind of IP-based data transparently through the Tor network on a \
location hidden basis. You can think of it as a point-to-multipoint VPN between \
hidden services."
LICENSE = "GPL-3.0-only"

PV = "4.11.0"

RPM_NAME = "onioncat-4.11.0-1.4.aarch64.rpm"
RPM_HASH = "fd4ce701b29141c668c01961f883a466d7202392f9f303ace76d6b0871a71442001aa27e0e367b1b3e6a2810224f49dfa20fcbf9afbbaf90794063485f8cce5d"

RPROVIDES:${PN} += "onioncat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
tor"

inherit rpm
