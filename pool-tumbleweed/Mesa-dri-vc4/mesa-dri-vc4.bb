SUMMARY = "Mesa DRI plug-in for 3D acceleration on Raspberry Pi"
DESCRIPTION = "This package contains vc4_dri.so, which is necessary for 3D \
acceleration on the Raspberry Pi to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-dri-vc4-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "05e831b834af2fcbf8f0d56b028b548e49e7100b3bef3e7d9a829a3da6ec426a1a3e18599407bb03f490003e191886de11d07647d1def4ffdbdbf160e94a62ca"

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
