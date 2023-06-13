SUMMARY = "VDPAU state tracker for Nouveau"
DESCRIPTION = "This package contains the VDPAU state tracker for Nouveau."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_nouveau-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "b23cea47fe699690e352d85f5cc3311e721b016ead93c17af1b0dbe6445450739f89333b03d2aca6162f3df46c1ccf1dbd841528395363d494131b3eaff5d973"

RPROVIDES:${PN} += "libvdpau_gallium.so.1.0.0()(64bit) \
libvdpau_nouveau \
libvdpau_nouveau(aarch-64)"

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
