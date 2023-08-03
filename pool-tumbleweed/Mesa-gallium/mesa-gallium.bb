SUMMARY = "Mesa Gallium GPU drivers"
DESCRIPTION = "This package contains Mesa Gallium drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-gallium-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "f5f2a076e66eb95a4a6beb89fa1d513b94461699a4e1482847598d6a01c41114822846c20b3a9f8d1eccd5104323032948f71342a52fbccd44497dd1a2890b87"

RPROVIDES:${PN} += "Mesa-gallium"

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
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
