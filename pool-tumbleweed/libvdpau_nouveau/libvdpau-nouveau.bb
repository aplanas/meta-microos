SUMMARY = "VDPAU state tracker for Nouveau"
DESCRIPTION = "This package contains the VDPAU state tracker for Nouveau."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "libvdpau_nouveau-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "040e9df583f50315d8a1fb714b05c2374857eab64f909d262a805c28bd1460ad6a545979e8af9a2564dcb8f915a610bc9314d7b641c4fbe27acbaef5af16c8dc"

RPROVIDES:${PN} += "libvdpau-gallium.so.1.0.0 \
libvdpau-nouveau"

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
