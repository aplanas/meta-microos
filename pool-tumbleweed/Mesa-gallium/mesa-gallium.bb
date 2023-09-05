SUMMARY = "Mesa Gallium GPU drivers"
DESCRIPTION = "This package contains Mesa Gallium drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-gallium-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "8fea6b1f79b900ef96384a762b554855ca0f441f8836c229d87b6eb1cc89eccbea167ebcda453ae47ad645f3af742bb9a2df15847c1255a79859e121011c3587"

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
