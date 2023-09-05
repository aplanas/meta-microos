SUMMARY = "C bindings for Google's Protocol Buffers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libprotobuf-c-devel-1.4.1-6.1.aarch64.rpm"
RPM_HASH = "a8c9949a534355c3bbc30680b6e60d628127e6cf0b276ec6e5ef52eb9969f2ec6dcb528dd793e6aeab77d23662b0170c58ecba98883686382531c25d15b4d962"

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
