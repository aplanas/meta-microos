SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-dri-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "b6d0ca098f0df45de5466a0086f5fbe2d31701a11a634e4bed9b775ffc1a3fb8dc1490ce18bcfcc7a400a9a1802fcfe953d9153f9a23822b864fbcc9f97b378b"

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
