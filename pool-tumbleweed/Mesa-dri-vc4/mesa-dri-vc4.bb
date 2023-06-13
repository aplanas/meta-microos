SUMMARY = "Mesa DRI plug-in for 3D acceleration on Raspberry Pi"
DESCRIPTION = "This package contains vc4_dri.so, which is necessary for 3D \
acceleration on the Raspberry Pi to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-vc4-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "8de215675a1008f9b2f089de8e1a52af0a6c052306d27467a11f0ff34f3d3d4da8cbf5177c9fa7f755f84a6f6badae60e24bb9aa934f9d3dea6b744d27af61a6"

RPROVIDES:${PN} += "Mesa-dri-vc4 \
Mesa-dri-vc4(aarch-64) \
libgallium_dri.so()(64bit)"

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
libglapi.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
