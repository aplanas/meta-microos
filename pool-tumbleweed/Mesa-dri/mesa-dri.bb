SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-dri-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "217941e36b3e990f265d7c61346a838c86c21d82e219420b37ee88d904181b3a51723b63e033f1ecb5e88b60b21794fe242a15d0e4af40b592da136cb548be95"

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
