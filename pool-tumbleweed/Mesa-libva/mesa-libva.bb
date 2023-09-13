SUMMARY = "Mesa VA-API implementation"
DESCRIPTION = "This package contains the Mesa VA-API implementation provided through gallium."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libva-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "9abd8e6795979b7b681ea677f418d1d9bf102ec0848f85c01e02c49cf459091c45c1e5eb4d86a2aaebd3baff2532cbe697fd62d0a12cb7c87580a0c7db673e54"

RPROVIDES:${PN} += "Mesa-libva \
libgallium-drv-video.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libX11-xcb.so.1 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm-nouveau.so.2 \
libdrm-radeon.so.1 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb-dri2.so.0 \
libxcb-dri3.so.0 \
libxcb-present.so.0 \
libxcb-sync.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxshmfence.so.1 \
libz.so.1"

inherit rpm
