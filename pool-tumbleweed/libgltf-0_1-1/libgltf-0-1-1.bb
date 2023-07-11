SUMMARY = "C++ Library for rendering OpenGL models stored in glTF format"
DESCRIPTION = "libgltf is a library for rendering OpenGL models stored in glTF format"
LICENSE = "MPL-2.0"

PV = "0.1.0"

RPM_NAME = "libgltf-0_1-1-0.1.0-2.26.aarch64.rpm"
RPM_HASH = "8c952510dee3a2669b2680f486d9bed704170f8e8201cadab8a79674ba2cd3a97626b8a0c9d0eebcb055e0cdee044d989f76058785ff1b4b08e16bcea567bcb0"

RPROVIDES:${PN} += "libgltf-0-1-1 \
libgltf-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
