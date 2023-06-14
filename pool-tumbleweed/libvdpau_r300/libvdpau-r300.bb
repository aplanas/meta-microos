SUMMARY = "VDPAU state tracker for R300"
DESCRIPTION = "This package contains the VDPAU state tracker for R300."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_r300-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "3818bbeb3545458a8da4b0e54066dd5e7e0ea0da23fb5b22907eb878bdb3fca0edd06c52e4268df28fada34dc74d0cbee31545b360c311ffe677b624e8fb90c5"

RPROVIDES:${PN} += "libvdpau-gallium.so.1.0.0 \
libvdpau-r300"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
