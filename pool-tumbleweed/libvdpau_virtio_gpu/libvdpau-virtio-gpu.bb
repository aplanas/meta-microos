SUMMARY = "VDPAU state tracker for VirtIO GPU"
DESCRIPTION = "This package contains the VDPAU state tracker for VirtIO GPU."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "libvdpau_virtio_gpu-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "0ea194d997e86087be63aedc175c1767a183b88adaa6d53b28914cd326b6e098642063dd6415db34d7ff2c84ebefcccdd3efd330fb6a41a74fbd1ce1fc1471e0"

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
