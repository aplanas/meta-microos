SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-dri-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "8a5c2b7deec7008a8d99c103a5ee249f3e356a2299cc2be3afa7906a98c7287fae7f27f101580ad3edf50909fe01bc9a32d7e663aeab7d7214d3bd9f9d49557a"

RPROVIDES:${PN} += "Mesa-dri \
config-Mesa-dri \
libgallium-dri.so"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm-nouveau.so.2 \
libdrm-radeon.so.1 \
libdrm.so.2 \
libelf.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libglapi.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
