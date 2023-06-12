SUMMARY = "Mesa Direct3D9 state tracker development package"
DESCRIPTION = "Mesa Direct3D9 state tracker development package"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libd3d-devel-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "9ceb6a7bc0a34619ad27e7d6f8dfed68ed1fa5e8900546e4a0e757a463b5c8ec7261640447a7c85ecf91da257e25d1f43d70564341e6bca9d169468bd194feb1"

RPROVIDES:${PN} += "Mesa-libd3d-devel \
Mesa-libd3d-devel(aarch-64) \
pkgconfig(d3d)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libd3d \
pkgconfig(libdrm)"

inherit rpm
