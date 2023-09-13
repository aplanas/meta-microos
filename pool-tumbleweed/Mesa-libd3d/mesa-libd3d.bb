SUMMARY = "Mesa Direct3D9 state tracker"
DESCRIPTION = "Mesa Direct3D9 state tracker"
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libd3d-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "1d9a0116ec4af9866d45e2b35bb95330d4fcbaedc49d468390234e772b486d5e159850a13d5ef5d02408ab6b9ed2972b3f06637d1435d35500bf4df2b117e746"

RPROVIDES:${PN} += "Mesa-libd3d \
d3dadapter9.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
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
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
