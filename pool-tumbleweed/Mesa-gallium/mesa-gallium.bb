SUMMARY = "Mesa Gallium GPU drivers"
DESCRIPTION = "This package contains Mesa Gallium drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-gallium-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "18c923c5077daaddeaa86f84b8298085305f7858e4fcfc4818f8c9fb6e644f0073164c431802545900aea30e6a377250abec4ae2fc0e092397a59e6337783919"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
