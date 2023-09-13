SUMMARY = "Mesa DRI plug-in for 3D acceleration via Nouveau"
DESCRIPTION = "This package contains nouveau_dri.so, which is necessary for \
Nouveau's 3D acceleration to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-dri-nouveau-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "ac913355efc63a635204aa6a8fe89f1ee865a2d9a7c5a257ab03132c38b9d5e6551cce44c4eb5c93863134f5eeb282018b3aef8d5464e646ed6aaa908afdb8f6"

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
libz.so.1"

inherit rpm
