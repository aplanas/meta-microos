SUMMARY = "VDPAU state tracker for Nouveau"
DESCRIPTION = "This package contains the VDPAU state tracker for Nouveau."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvdpau_nouveau-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "67c7efb36245dd58a3e48ce3e0c0e0a509ec40c90b669339e827ac5505b95c9d87814e4269b24cfaaac09b488d8ebe2d633fc7738a56be915a2374ae7775f15d"

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
