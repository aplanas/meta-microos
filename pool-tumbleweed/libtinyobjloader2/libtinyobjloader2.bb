SUMMARY = "Wavefront .obj file loader"
DESCRIPTION = "A single-file Wavefront .obj loader written in C++. \
It can parse over 10M polygons with moderate memory and time."
LICENSE = "MIT"

PV = "2.0.0rc9"

RPM_NAME = "libtinyobjloader2-2.0.0rc9-1.5.aarch64.rpm"
RPM_HASH = "93968bf273ad9729f6c045dfa28e3147850a32031edf0260d0dbd4b5c6a5443ea8084f826ab81eb917d8d096a92f26c77f4913038ef8bdb6b0b8e4bad6c542a9"

RPROVIDES:${PN} += "libtinyobjloader.so.2 \
libtinyobjloader2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
