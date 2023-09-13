SUMMARY = "VDPAU state tracker for VirtIO GPU"
DESCRIPTION = "This package contains the VDPAU state tracker for VirtIO GPU."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libvdpau_virtio_gpu-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "dbdbe0a2b481673d9f28ed1d47c6a9b5eaa8af9e5c51102cb9ba35075b257b9e421e772dcc9129db47a326caca2a209f6d7a59fb729ae65e05f4d1923bc251cd"

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
