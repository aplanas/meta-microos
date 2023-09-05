SUMMARY = "Mesa Direct3D9 state tracker"
DESCRIPTION = "Mesa Direct3D9 state tracker"
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libd3d-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "3b77713177f0f1b2b3a77a7d77e9ad96a871fde805b178f2ba3f56baf308276739c3ac28dfdfe3216dd642f8ac679d94a799d6aa857262f0afb84484dd9dd14c"

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
