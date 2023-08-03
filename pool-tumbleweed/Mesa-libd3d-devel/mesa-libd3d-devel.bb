SUMMARY = "Mesa Direct3D9 state tracker development package"
DESCRIPTION = "Mesa Direct3D9 state tracker development package"
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libd3d-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "fe0278c88fec0c1ae8b20de50146d8cddae4dd584b161fe847b61df3b12274287cfc27b2930a8c0a818b74d5453f0b6208bb059941572d31def8c31664157e48"

RPROVIDES:${PN} += "Mesa-libd3d-devel \
pkgconfig-d3d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libd3d \
pkgconfig-libdrm"

inherit rpm
