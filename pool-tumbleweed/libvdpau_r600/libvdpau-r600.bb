SUMMARY = "VDPAU state tracker for R600"
DESCRIPTION = "This package contains the VDPAU state tracker for R600."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "libvdpau_r600-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "250c3a2921029f82107ec9dce380ea6a8cf066896ba07a8210e474326f85075c6df3dad0c66efd8fdc775d443d3a63ef0d7cc4a1e99492f8900fdc1869855290"

RPROVIDES:${PN} += "libvdpau-gallium.so.1.0.0 \
libvdpau-r600"

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
