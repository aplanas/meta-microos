SUMMARY = "VDPAU state tracker for R600"
DESCRIPTION = "This package contains the VDPAU state tracker for R600."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "libvdpau_r600-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "69246495d278879f1f26fc3d3993a86426b073510eabfea7e783bde2073f15b0647ad3d42a8b9be8e94b79f95b12156dee382256ee615a851968f048c28e5e2c"

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
