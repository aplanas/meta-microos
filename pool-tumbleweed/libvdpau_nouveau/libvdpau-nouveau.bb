SUMMARY = "VDPAU state tracker for Nouveau"
DESCRIPTION = "This package contains the VDPAU state tracker for Nouveau."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvdpau_nouveau-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "8ab6e05c252d3410524fa89d3324c05e41a82da4ba94fe11fd679f9fb9f231842b591db047b28ab66d0c9a3b017b8715352bb657fbd49318637e5b41cf445919"

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
