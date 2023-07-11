SUMMARY = "Mesa Direct3D9 state tracker"
DESCRIPTION = "Mesa Direct3D9 state tracker"
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libd3d-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "2c88315abc700097d722828f5f69a1ad02dc60e7d8ab8cd901d7dd7712c1397c8c652f063a341c0318d6be429cde62325099f5e87e804ea6e18d36d2bc930d7b"

RPROVIDES:${PN} += "Mesa-libd3d \
d3dadapter9.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
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
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
