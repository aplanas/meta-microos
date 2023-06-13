SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "072903197d9c6ee6f2b1de946a62944711d4afcda02260bbdf3b73df750ac4aeebd1cf0e5478d58aa0866df0dfa9b6e4ab247f2795cb28a540e97fe1451ef29f"

RPROVIDES:${PN} += "Mesa-dri \
Mesa-dri(aarch-64) \
config(Mesa-dri) \
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
