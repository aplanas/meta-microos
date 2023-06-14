SUMMARY = "Mesa DRI plug-in for 3D acceleration via Nouveau"
DESCRIPTION = "This package contains nouveau_dri.so, which is necessary for \
Nouveau's 3D acceleration to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-dri-nouveau-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "246a48083eb4c815d9a44f4d41998a0a23e595e6c5310f86a70236ec60a586f55961b7bf3efe50762206b4b7e5bf03529a7cdd932235d394477bdb0fbf268238"

RPROVIDES:${PN} += "Mesa-dri-nouveau \
libgallium-dri.so"

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
libglapi.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
