SUMMARY = "VDPAU state tracker for R600"
DESCRIPTION = "This package contains the VDPAU state tracker for R600."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_r600-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "d2d2b7b9b2aefb92567239f168b43d8a4ffde91e119f772a56c67c79f9cf48b38f5f2df2f55872c75709545716abb1268fd15ddd7f0068aab8a0a12021e9d0e3"

RPROVIDES:${PN} += "libvdpau_gallium.so.1.0.0()(64bit) \
libvdpau_r600 \
libvdpau_r600(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libX11-xcb.so.1()(64bit) \
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
libxcb-dri2.so.0()(64bit) \
libxcb-dri3.so.0()(64bit) \
libxcb-present.so.0()(64bit) \
libxcb-sync.so.1()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxshmfence.so.1()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
