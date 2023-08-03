SUMMARY = "VDPAU state tracker for VirtIO GPU"
DESCRIPTION = "This package contains the VDPAU state tracker for VirtIO GPU."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvdpau_virtio_gpu-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "e14dfeb79ab186f18727fc02e282c835f29954255c8f719311b2cb0f8aca37e61f3f97329623380969722c8b1a94bf1f8b99de1c5d7b62c1a77122c1bbff4474"

RPROVIDES:${PN} += "libvdpau-gallium.so.1.0.0 \
libvdpau-virtio-gpu"

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
