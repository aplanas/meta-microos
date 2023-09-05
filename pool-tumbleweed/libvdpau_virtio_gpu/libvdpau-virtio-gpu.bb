SUMMARY = "VDPAU state tracker for VirtIO GPU"
DESCRIPTION = "This package contains the VDPAU state tracker for VirtIO GPU."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "libvdpau_virtio_gpu-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "3b681a25235fe664e157ffc6f7dd65d16b1fb0d2672be6a5841deb592eda36dadb1f4f2edf6a89794e8aff6d13e122a91034b69dba1f66b8ed3089f629e6c908"

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
