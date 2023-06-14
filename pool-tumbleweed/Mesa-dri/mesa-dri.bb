SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "072903197d9c6ee6f2b1de946a62944711d4afcda02260bbdf3b73df750ac4aeebd1cf0e5478d58aa0866df0dfa9b6e4ab247f2795cb28a540e97fe1451ef29f"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
