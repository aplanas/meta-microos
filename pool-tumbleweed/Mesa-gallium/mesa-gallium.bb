SUMMARY = "Mesa Gallium GPU drivers"
DESCRIPTION = "This package contains Mesa Gallium drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-gallium-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "31d35233787b8149420e0377de1f8825e614b2827b8331eb7e97a12302c63751ba4d228b0b8ba0075873791be8b9d87e8277f6c21b68ed41c6a9f1d2a50cacba"

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
