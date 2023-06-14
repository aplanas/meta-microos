SUMMARY = "C++ Library for rendering OpenGL models stored in glTF format"
DESCRIPTION = "libgltf is a library for rendering OpenGL models stored in glTF format"
LICENSE = "MPL-2.0"

PV = "0.1.0"

RPM_NAME = "libgltf-0_1-1-0.1.0-2.25.aarch64.rpm"
RPM_HASH = "bcbe81dee683d9b7884022da966e11c0f6c5ee6588a0c77a84d5d9df882a1284ed553f91913675faa810fb4d826617914dff5ff70fd653488eb3b33a5537f99d"

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
