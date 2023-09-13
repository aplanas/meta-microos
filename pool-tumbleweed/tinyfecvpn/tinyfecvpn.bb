SUMMARY = "A VPN designed for lossy links with build-in FEC"
DESCRIPTION = "A VPN designed for lossy links, with build-in support for Forward Error \
Correction (FEC). This can improve network quality on high-latency lossy links."
LICENSE = "MIT"

PV = "20230206.0"

RPM_NAME = "tinyfecvpn-20230206.0-1.1.aarch64.rpm"
RPM_HASH = "be727b65ac4d31e47f8a4d0b8cfc3aea7eccd79ee1a2d16a0288ede48fd749460e29451ae9333af4c01427dfc90796e024b69c8e9ea18d6afc699993d8cc22ea"

RPROVIDES:${PN} += "tinyfecvpn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
