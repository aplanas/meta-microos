SUMMARY = "VDPAU state tracker for radeonsi"
DESCRIPTION = "This package contains the VDPAU state tracker for radeonsi."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "libvdpau_radeonsi-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "adc7344e250b10c45731d5bf5c61c85cb6c92a20ad06eca13ec5956078336d3a122ae97adbfcde12d60560812366722d1f56b5ed5684d251f39e0bf88e8dcd7f"

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
