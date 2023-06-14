SUMMARY = "Header files, libraries and development documentation for protobuf"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf-devel-21.12-3.2.aarch64.rpm"
RPM_HASH = "fd0b91a0e0ef5f973f790e3de23878b63090c8cc564e68934d55117c63b530eb6b9015c20b307c5c597ad14e238a4bb4cf3ac4c783aa1d366a653a7f12e8af56"

RPROVIDES:${PN} += "libprotobuf-devel \
pkgconfig-protobuf \
pkgconfig-protobuf-lite \
protobuf-devel"

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
