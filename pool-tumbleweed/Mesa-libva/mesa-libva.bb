SUMMARY = "Mesa VA-API implementation"
DESCRIPTION = "This package contains the Mesa VA-API implementation provided through gallium."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libva-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "0acc0781e860e02eece44a6dd537b7e41ddf0dfd381e8b60242319749435d93dd4f4a71109d441859361b6c78235f898f330b2b86d2d3d8577b71ad9feb7941a"

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
