SUMMARY = "VDPAU state tracker for VirtIO GPU"
DESCRIPTION = "This package contains the VDPAU state tracker for VirtIO GPU."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvdpau_virtio_gpu-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "7086d7d08288cfa9d58c2d4c90a59158d013354732606f82c72e709ffbcca3dc248495f3f3e6a7e62d140ec15d9894ccb52ceedba1d3cd7e47d27e1e9e2c7e70"

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
