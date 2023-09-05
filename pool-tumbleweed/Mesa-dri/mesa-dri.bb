SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-dri-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "b54e05de7957a6f6f33704d55e62c2cd6ce3f43a524ad4c8b0b624a16973401d5a3c9abeb3d191e8dfbcf848fadf4011c1d7810a707a1ab4f0c408a2e0cfe33d"

RPROVIDES:${PN} += "Mesa-dri \
config-Mesa-dri \
libgallium-dri.so"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm-nouveau.so.2 \
libdrm-radeon.so.1 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libglapi.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
