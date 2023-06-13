SUMMARY = "Mesa DRI plug-in for 3D acceleration via Nouveau"
DESCRIPTION = "This package contains nouveau_dri.so, which is necessary for \
Nouveau's 3D acceleration to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-nouveau-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "246a48083eb4c815d9a44f4d41998a0a23e595e6c5310f86a70236ec60a586f55961b7bf3efe50762206b4b7e5bf03529a7cdd932235d394477bdb0fbf268238"

RPROVIDES:${PN} += "Mesa-dri-nouveau \
Mesa-dri-nouveau(aarch-64) \
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
