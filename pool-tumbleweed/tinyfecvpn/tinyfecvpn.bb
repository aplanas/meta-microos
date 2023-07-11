SUMMARY = "A VPN designed for lossy links with build-in FEC"
DESCRIPTION = "A VPN designed for lossy links, with build-in support for Forward Error \
Correction (FEC). This can improve network quality on high-latency lossy links."
LICENSE = "MIT"

PV = "20210116.0"

RPM_NAME = "tinyfecvpn-20210116.0-1.11.aarch64.rpm"
RPM_HASH = "12844dce4dc3d0961dc802e72833aa3a4f2e859d0114c7fbac7f87b3f35fa8a142f65e7c29b8582dd05e150dcfe2fbcd09d38de45e023cba8509709388486f03"

RPROVIDES:${PN} += "tinyfecvpn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
