SUMMARY = "VDPAU state tracker for R600"
DESCRIPTION = "This package contains the VDPAU state tracker for R600."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_r600-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "d2d2b7b9b2aefb92567239f168b43d8a4ffde91e119f772a56c67c79f9cf48b38f5f2df2f55872c75709545716abb1268fd15ddd7f0068aab8a0a12021e9d0e3"

RPROVIDES:${PN} += "libvdpau-gallium.so.1.0.0 \
libvdpau-r600"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
