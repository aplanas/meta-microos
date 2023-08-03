SUMMARY = "Mesa VA-API implementation"
DESCRIPTION = "This package contains the Mesa VA-API implementation provided through gallium."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libva-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "c92119f960bdc2ea578b820fee3d3a22df412b0fc1a629dabaddd129fea818a385b53a377e058e7a7f6d59360128c7d51050f383d991c892460e7b4f2a283093"

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
