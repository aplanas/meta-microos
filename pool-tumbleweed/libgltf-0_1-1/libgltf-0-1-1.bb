SUMMARY = "C++ Library for rendering OpenGL models stored in glTF format"
DESCRIPTION = "libgltf is a library for rendering OpenGL models stored in glTF format"
LICENSE = "MPL-2.0"

PV = "0.1.0"

RPM_NAME = "libgltf-0_1-1-0.1.0-2.25.aarch64.rpm"
RPM_HASH = "bcbe81dee683d9b7884022da966e11c0f6c5ee6588a0c77a84d5d9df882a1284ed553f91913675faa810fb4d826617914dff5ff70fd653488eb3b33a5537f99d"

RPROVIDES:${PN} += "libgltf-0.1.so.1()(64bit) \
libgltf-0_1-1 \
libgltf-0_1-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libepoxy.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
