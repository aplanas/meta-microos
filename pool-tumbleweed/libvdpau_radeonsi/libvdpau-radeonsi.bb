SUMMARY = "VDPAU state tracker for radeonsi"
DESCRIPTION = "This package contains the VDPAU state tracker for radeonsi."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "libvdpau_radeonsi-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "4646b81f6e2980e947a38bbacdfd4df339f4d268eb9e8efd7d7470b81ae0e2bc3ce6e418121f62f9675067e213b9395d838917858928db4b6b88ee4f4cfa2df3"

RPROVIDES:${PN} += "libvdpau-gallium.so.1.0.0 \
libvdpau-radeonsi"

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
