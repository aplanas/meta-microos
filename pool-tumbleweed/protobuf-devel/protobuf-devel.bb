SUMMARY = "Header files, libraries and development documentation for protobuf"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "protobuf-devel-23.4-6.2.aarch64.rpm"
RPM_HASH = "df2b8f5442e374c0602042e3e6fb70c3bef0b6fe91494c239fe4b67667d9293d6ad96da02637a8a41d2a06ab81b4c253643b627278fc78c01282d17e9446283f"

RPROVIDES:${PN} += "cmake-protobuf \
cmake-utf8-range \
libprotobuf-devel \
pkgconfig-protobuf \
pkgconfig-protobuf-lite \
pkgconfig-utf8-range \
protobuf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
abseil-cpp-devel \
gcc-c++ \
ld-linux-aarch64.so.1 \
libabsl-log-initialize.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-lite23-4-0 \
libprotobuf23-4-0 \
libprotoc.so.23.4.0 \
libstdc++.so.6 \
pkgconfig-absl-absl-check \
pkgconfig-absl-absl-log \
pkgconfig-absl-algorithm \
pkgconfig-absl-base \
pkgconfig-absl-bind-front \
pkgconfig-absl-bits \
pkgconfig-absl-btree \
pkgconfig-absl-cleanup \
pkgconfig-absl-cord \
pkgconfig-absl-core-headers \
pkgconfig-absl-debugging \
pkgconfig-absl-die-if-null \
pkgconfig-absl-dynamic-annotations \
pkgconfig-absl-flags \
pkgconfig-absl-flat-hash-map \
pkgconfig-absl-flat-hash-set \
pkgconfig-absl-function-ref \
pkgconfig-absl-hash \
pkgconfig-absl-layout \
pkgconfig-absl-log-initialize \
pkgconfig-absl-log-severity \
pkgconfig-absl-memory \
pkgconfig-absl-node-hash-map \
pkgconfig-absl-node-hash-set \
pkgconfig-absl-optional \
pkgconfig-absl-span \
pkgconfig-absl-status \
pkgconfig-absl-statusor \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization \
pkgconfig-absl-time \
pkgconfig-absl-type-traits \
pkgconfig-absl-utility \
pkgconfig-absl-variant \
pkgconfig-utf8-range \
pkgconfig-zlib"

inherit rpm
