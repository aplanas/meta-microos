SUMMARY = "VDPAU state tracker for Nouveau"
DESCRIPTION = "This package contains the VDPAU state tracker for Nouveau."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_nouveau-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "b23cea47fe699690e352d85f5cc3311e721b016ead93c17af1b0dbe6445450739f89333b03d2aca6162f3df46c1ccf1dbd841528395363d494131b3eaff5d973"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
