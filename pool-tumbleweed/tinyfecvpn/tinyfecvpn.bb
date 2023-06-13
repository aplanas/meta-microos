SUMMARY = "A VPN designed for lossy links with build-in FEC"
DESCRIPTION = "A VPN designed for lossy links, with build-in support for Forward Error \
Correction (FEC). This can improve network quality on high-latency lossy links."
LICENSE = "MIT"

PV = "20210116.0"

RPM_NAME = "tinyfecvpn-20210116.0-1.10.aarch64.rpm"
RPM_HASH = "7c126c1684271fc062cc276bf5e95ed51f9b4d86d7ef221f39a8b4eb993edd8920137fbb35caaafbd12983637fd8ef38b920fc1d8d51054642dfcf5dc718b3d7"

RPROVIDES:${PN} += "tinyfecvpn \
tinyfecvpn(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
