SUMMARY = "Mesa Direct3D9 state tracker"
DESCRIPTION = "Mesa Direct3D9 state tracker"
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libd3d-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "5101046cd14076341377b91f8ef98cffb38ae541d7a6fc063649553752364282a4dc9061195af74cc87969e04adac3b2dc1a9e5a010d4911080b13ab232f4096"

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
