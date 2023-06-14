SUMMARY = "VDPAU state tracker for radeonsi"
DESCRIPTION = "This package contains the VDPAU state tracker for radeonsi."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libvdpau_radeonsi-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "a13db48b1c0e9bf2cafda8a910e374f2eba69b37b04deda3a76544754db12dfe2720e56b38d563bbca311f33a18b8db8e453a46595fe16adc0ce70e1a4f024ca"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
