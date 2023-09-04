SUMMARY = "Mesa Direct3D9 state tracker"
DESCRIPTION = "Mesa Direct3D9 state tracker"
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libd3d-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "86cdd4c195012fc5142f108a0ed79accdfa9eb9be0e66c379fb60ec202b9086aa7ac26e91a934c0617e807913bd682ca81987080dfe5d611f298a12ded62a536"

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
