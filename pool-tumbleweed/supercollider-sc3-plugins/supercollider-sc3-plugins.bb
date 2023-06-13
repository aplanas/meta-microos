SUMMARY = "Collection of SuperCollider plugins"
DESCRIPTION = "Collection of free and usefull SuperCollider plugins"
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-sc3-plugins-3.13.0-1.3.aarch64.rpm"
RPM_HASH = "5cc4d6c6d4f5bfe1c367545775a6fa90c482236add04c5bbe2747bddb3fe393bdfd9306f0e69a76967f42812e167dea88ac831719a873c6431571e14e3360a32"

RPROVIDES:${PN} += "supercollider-sc3-plugins \
supercollider-sc3-plugins(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
supercollider"

inherit rpm
