SUMMARY = "VDPAU state tracker for Nouveau"
DESCRIPTION = "This package contains the VDPAU state tracker for Nouveau."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libvdpau_nouveau-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "8af113fdbc295e750b5e7019f98a031dbad0026fc869a11f8ff09d79771d863f0686989b011254e79e7f49b63257b84961c6b2bd95df1b6149341879406984f8"

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
