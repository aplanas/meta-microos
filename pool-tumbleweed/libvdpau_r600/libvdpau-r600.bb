SUMMARY = "VDPAU state tracker for R600"
DESCRIPTION = "This package contains the VDPAU state tracker for R600."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvdpau_r600-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "550ca01d9da2e5df0a56090b3b9ba643e32442198d1ad16669a2b8d6ff509324af6b70bbc33175b65238f8a2382b72c0fc2f4b3ed21e73ab779643ebbe583d67"

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
libz.so.1"

inherit rpm
