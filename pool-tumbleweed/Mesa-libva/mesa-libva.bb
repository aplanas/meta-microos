SUMMARY = "Mesa VA-API implementation"
DESCRIPTION = "This package contains the Mesa VA-API implementation provided through gallium."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libva-23.0.3-349.2.aarch64.rpm"
RPM_HASH = "47a3fa219aa89993ee48af488e6f63c825d9bd1587d6d771b3fbe8144723ff588fdb0fdb7f402f164d60d95c8e0afb794e8450be6b04d414f88b3af1ea4b49b9"

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
libz.so.1 \
libzstd.so.1"

inherit rpm
