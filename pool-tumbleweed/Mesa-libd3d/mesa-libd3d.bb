SUMMARY = "Mesa Direct3D9 state tracker"
DESCRIPTION = "Mesa Direct3D9 state tracker"
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libd3d-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "fe5e510a2d2e104d58f0cc01d9db7b3e6593b26e79e1ac47e3ecf2bce79bed75b06504e3759f1c107a235e13abc39a1e6febd58f02c00c3e1f1c4ae15b4ac687"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
