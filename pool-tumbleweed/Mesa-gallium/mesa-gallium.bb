SUMMARY = "Mesa Gallium GPU drivers"
DESCRIPTION = "This package contains Mesa Gallium drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-gallium-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "0f4a86607ef07ce6cbd042bb7f7f4df6a7bdbb9c9d5409491c5458378a79a11ea6caa2f4e18d57f20e937f90d73e50b2372895d6030ba3116d1903b9c6e44e81"

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
