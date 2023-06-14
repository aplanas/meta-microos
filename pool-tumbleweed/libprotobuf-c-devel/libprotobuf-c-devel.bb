SUMMARY = "C bindings for Google's Protocol Buffers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libprotobuf-c-devel-1.4.1-4.1.aarch64.rpm"
RPM_HASH = "53e43d9fbb55fbbcd5bc69a3534280c932e878a9357b95d5b6ec4c50a7de20c40e13c8c31cd95b8f8bef4fe09cbe6e3ed86372bbb2f100cbf4a145683c624e9b"

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
