SUMMARY = "Header files, libraries and development documentation for protobuf21"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf21-devel-21.12-1.1.aarch64.rpm"
RPM_HASH = "e36fd21097cfa066ca7c159c86ae753f754d856b2814180d5198ce1f13ed17f1868a75b7efff9156a71132928c138560c6d51d813bf1912f46022f3316cb6aeb"

RPROVIDES:${PN} += "libprotobuf-devel \
pkgconfig-protobuf \
pkgconfig-protobuf-lite \
protobuf-devel \
protobuf21-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc-c++ \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-lite3-21-12 \
libprotobuf3-21-12 \
libprotoc-3.21.12.so \
libstdc++.so.6 \
pkgconfig-zlib"

inherit rpm
