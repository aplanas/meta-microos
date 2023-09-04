SUMMARY = "Mesa VA-API implementation"
DESCRIPTION = "This package contains the Mesa VA-API implementation provided through gallium."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libva-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "42e3a9df392453ed0a9bc41995eb3874a6e26afcbc2064d2b56af9e84a6f0ced6a2c44d4681101ddec02e176d47a8dc772c45621404144048c7fe16987f8716b"

RPROVIDES:${PN} += "Mesa-libva \
libgallium-drv-video.so"

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
