SUMMARY = "Mesa DRI plug-in for 3D acceleration via Nouveau"
DESCRIPTION = "This package contains nouveau_dri.so, which is necessary for \
Nouveau's 3D acceleration to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-dri-nouveau-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "de5d42ccb8bb82bebffdf05d3d61d2d8b96d775b24dd78056cc6fafa894cefb92bc7e35ba9a3b581fd75f24485d380108e5fc57e15cdec19f9a0c629413fd69b"

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
