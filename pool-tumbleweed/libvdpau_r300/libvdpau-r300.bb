SUMMARY = "VDPAU state tracker for R300"
DESCRIPTION = "This package contains the VDPAU state tracker for R300."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_r300-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "3818bbeb3545458a8da4b0e54066dd5e7e0ea0da23fb5b22907eb878bdb3fca0edd06c52e4268df28fada34dc74d0cbee31545b360c311ffe677b624e8fb90c5"

RPROVIDES:${PN} += "libvdpau_gallium.so.1.0.0()(64bit) \
libvdpau_r300 \
libvdpau_r300(aarch-64)"

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
