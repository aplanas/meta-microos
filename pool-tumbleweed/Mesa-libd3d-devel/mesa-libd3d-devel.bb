SUMMARY = "Mesa Direct3D9 state tracker development package"
DESCRIPTION = "Mesa Direct3D9 state tracker development package"
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libd3d-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "546dd3c687629b595dbaacd4b9b78a842ecc04f0978d2bb3d3a969d270aaedd6efccf53ee09b17d45c7d93abd37b6d56f52651fac2d8778ed432bff9ad5eddbc"

RPROVIDES:${PN} += "Mesa-libd3d-devel \
pkgconfig-d3d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libd3d \
pkgconfig-libdrm"

inherit rpm
