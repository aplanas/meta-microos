SUMMARY = "Mesa DRI plug-in for 3D acceleration on Raspberry Pi"
DESCRIPTION = "This package contains vc4_dri.so, which is necessary for 3D \
acceleration on the Raspberry Pi to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-vc4-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "8de215675a1008f9b2f089de8e1a52af0a6c052306d27467a11f0ff34f3d3d4da8cbf5177c9fa7f755f84a6f6badae60e24bb9aa934f9d3dea6b744d27af61a6"

RPROVIDES:${PN} += "Mesa-dri-vc4 \
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
libz.so.1 \
libzstd.so.1"

inherit rpm
