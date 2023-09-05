SUMMARY = "Mesa DRI plug-in for 3D acceleration via Nouveau"
DESCRIPTION = "This package contains nouveau_dri.so, which is necessary for \
Nouveau's 3D acceleration to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-dri-nouveau-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "6246ce014789b2a1b6aec44aff3ac94171e26bc2c1f77acba9b9b22ff47735b3ff0ae356273c67d39119d9478ea89ae85945e65b811b0932207370f2a846ccd2"

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
