SUMMARY = "Mesa Gallium GPU drivers"
DESCRIPTION = "This package contains Mesa Gallium drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-gallium-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "18c923c5077daaddeaa86f84b8298085305f7858e4fcfc4818f8c9fb6e644f0073164c431802545900aea30e6a377250abec4ae2fc0e092397a59e6337783919"

RPROVIDES:${PN} += "Mesa-gallium \
Mesa-gallium(aarch-64)"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libdrm.so.2()(64bit) \
libdrm_amdgpu.so.1()(64bit) \
libdrm_nouveau.so.2()(64bit) \
libdrm_radeon.so.1()(64bit) \
libelf.so.1()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
