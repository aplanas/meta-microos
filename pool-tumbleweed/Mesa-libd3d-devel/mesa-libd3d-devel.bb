SUMMARY = "Mesa Direct3D9 state tracker development package"
DESCRIPTION = "Mesa Direct3D9 state tracker development package"
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libd3d-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "04b1fe15d57c67c459b43fe5d2aee8230b34761e4c441ce2240c1327151e82cb43663bd8d1477abb556331bab717915c8998d7b40c2c0801f2409c36a8ba6e35"

RPROVIDES:${PN} += "Mesa-libd3d-devel \
pkgconfig-d3d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libd3d \
pkgconfig-libdrm"

inherit rpm
