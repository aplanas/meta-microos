SUMMARY = "Mesa DRI plug-in for 3D acceleration on Raspberry Pi"
DESCRIPTION = "This package contains vc4_dri.so, which is necessary for 3D \
acceleration on the Raspberry Pi to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-dri-vc4-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "57261c243eec25e5c11d9dc79a96280a513212522cc83988f57797e2e69584f038de425246d3d37fb0b68957915647bf9cabb2d5b9f96d7f1c43806dea42517f"

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
libz.so.1"

inherit rpm
