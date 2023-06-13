SUMMARY = "Mesa VA-API implementation"
DESCRIPTION = "This package contains the Mesa VA-API implementation provided through gallium."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libva-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "47a3fa219aa89993ee48af488e6f63c825d9bd1587d6d771b3fbe8144723ff588fdb0fdb7f402f164d60d95c8e0afb794e8450be6b04d414f88b3af1ea4b49b9"

RPROVIDES:${PN} += "Mesa-libva \
Mesa-libva(aarch-64) \
libgallium_drv_video.so()(64bit)"

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
