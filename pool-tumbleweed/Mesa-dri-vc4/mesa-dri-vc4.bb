SUMMARY = "Mesa DRI plug-in for 3D acceleration on Raspberry Pi"
DESCRIPTION = "This package contains vc4_dri.so, which is necessary for 3D \
acceleration on the Raspberry Pi to work. It is packaged separately \
since it is still experimental."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-dri-vc4-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "96c4d2944ae28be17c7c6e2df31f6d237ea676523257fa81a0f3824b7f9a9be3a1212f4df6c4c1210bc6f8c5830ef5e2a6b0a0b8b8de4cdb266774f08a6a61e2"

RPROVIDES:${PN} += "Mesa-dri-vc4 \
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
