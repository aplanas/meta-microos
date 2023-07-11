SUMMARY = "WireGuard plugin for connman"
DESCRIPTION = "Provides WireGuard network support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-wireguard-1.41-4.8.aarch64.rpm"
RPM_HASH = "1b27abd033f7355c99635c517ef7df324f24a21f805920b3c9bb496dc3e2892f3e7bc82a9efa1dcccc3abf5393fe49bb5a03b81cf9d3c220894d749424d00248"

RPROVIDES:${PN} += "connman-plugin-wireguard"

RDEPENDS:${PN} += "connman \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
