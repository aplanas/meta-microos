SUMMARY = "C bindings for Google's Protocol Buffers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libprotobuf-c-devel-1.4.1-5.1.aarch64.rpm"
RPM_HASH = "4c0f65c30e3d1eb60dd8ecf8a655f60cfac9b6d06d0fd355611a987e5d55fc23edd39fbe27769a7bc75e348d1ce3425c6990deb6fe7220a704531b3a733c69b1"

RPROVIDES:${PN} += "libprotobuf-c-devel \
pkgconfig-libprotobuf-c \
protobuf-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libprotobuf-c1 \
libprotoc-3.21.12.so \
libstdc++.so.6"

inherit rpm
