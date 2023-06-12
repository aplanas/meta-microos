SUMMARY = "VPN adapter for Tor and I2P"
DESCRIPTION = "OnionCat creates a transparent IP layer on top of Tor's hidden services. It \
transmits any kind of IP-based data transparently through the Tor network on a \
location hidden basis. You can think of it as a point-to-multipoint VPN between \
hidden services."
LICENSE = "GPL-3.0-only"

PV = "4.11.0"

RPM_NAME = "onioncat-4.11.0-1.3.aarch64.rpm"
RPM_HASH = "756601796b0c69cc68c8e5d0d75f1778f50d27aa284c33b980ddb25e49d8843f0a6308c63d9c91d3e641043d446dc0dc93aa187b7933d5e7e71c9098acb47277"

RPROVIDES:${PN} += "onioncat \
onioncat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
tor"

inherit rpm
