SUMMARY = "Mesa Gallium GPU drivers"
DESCRIPTION = "This package contains Mesa Gallium drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-gallium-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "1dda7f4c2f7635d70510a85f6dcb93835d16e27af9f22a56e144a4e4b8aa1f3ed67d9dc1f9b2006f750fdcefc0c629ab36c641f738a0fcb24a9c0a8d3f2c3856"

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
