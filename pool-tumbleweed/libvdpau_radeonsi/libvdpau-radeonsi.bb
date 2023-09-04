SUMMARY = "VDPAU state tracker for radeonsi"
DESCRIPTION = "This package contains the VDPAU state tracker for radeonsi."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvdpau_radeonsi-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "02977ec731cc42f889791d4219869257da389e019ea32f1d629a5b39d6037b21472f3d4444858ec6ba6fe5c629906c7e8c6c5199494e7c25fde116a5fd74bc12"

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
