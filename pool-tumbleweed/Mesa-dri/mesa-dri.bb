SUMMARY = "DRI plug-ins for 3D acceleration"
DESCRIPTION = "This package contains Mesa DRI drivers for 3D acceleration."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-dri-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "18347212e9cb2020278f189b0c3d0d25c2913bcbe05e2e2a53f08a9b7f9694b7aff49faafefd41bad6b0961ec9846a3b44247745cbb44f6dbc529b4749db6d53"

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
