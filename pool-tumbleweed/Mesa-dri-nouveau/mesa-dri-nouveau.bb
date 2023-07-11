SUMMARY = "Mesa DRI plug-in for 3D acceleration via Nouveau"
DESCRIPTION = "This package contains nouveau_dri.so, which is necessary for \
Nouveau's 3D acceleration to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-dri-nouveau-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "aa0051c0d45e9929c624c31cf0ccf81023011cfbce2cfb3cd559674eb0db79969d1e708c703ae9f9e7b619b01ed5cad506dab987d229481dc6fa34a5c25eb80d"

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
