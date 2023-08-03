SUMMARY = "Mesa DRI plug-in for 3D acceleration on Raspberry Pi"
DESCRIPTION = "This package contains vc4_dri.so, which is necessary for 3D \
acceleration on the Raspberry Pi to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-dri-vc4-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "98ac751d945d9fccfe686392d6c53f181b67b9392fe32f5a112d3fca91f71332de21c2e628708b1a3a8cff5f753cc92338106a439793131894c9b6ee810b235b"

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
