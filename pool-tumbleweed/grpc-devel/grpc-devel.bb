SUMMARY = "Development files for grpc, a HTTP/2 Remote Procedure Call implementation"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "grpc-devel-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "278fd7a856a00ddfbec8c2f4f5f4be02b5a6cee72bd24ff102f6ff4f2ceb5a4b346e599f25be02ab08033050db0ba326a290627784fce5aab91183df3c073c63"

RPROVIDES:${PN} += "cmake-gRPC \
grpc-devel \
pkgconfig-gpr \
pkgconfig-grpc \
pkgconfig-grpc++ \
pkgconfig-grpc++-unsecure \
pkgconfig-grpc-unsecure"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgrpc++1-57 \
libgrpc-plugin-support.so.1.57 \
libgrpc1-57 \
libgrpc34 \
libprotobuf.so.23.4.0 \
libprotoc.so.23.4.0 \
libstdc++.so.6 \
libupb34 \
pkgconfig-absl-algorithm-container \
pkgconfig-absl-any-invocable \
pkgconfig-absl-base \
pkgconfig-absl-bind-front \
pkgconfig-absl-cleanup \
pkgconfig-absl-cord \
pkgconfig-absl-core-headers \
pkgconfig-absl-flags \
pkgconfig-absl-flags-marshalling \
pkgconfig-absl-flat-hash-map \
pkgconfig-absl-flat-hash-set \
pkgconfig-absl-function-ref \
pkgconfig-absl-hash \
pkgconfig-absl-inlined-vector \
pkgconfig-absl-memory \
pkgconfig-absl-optional \
pkgconfig-absl-random-random \
pkgconfig-absl-span \
pkgconfig-absl-status \
pkgconfig-absl-statusor \
pkgconfig-absl-str-format \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization \
pkgconfig-absl-time \
pkgconfig-absl-type-traits \
pkgconfig-absl-utility \
pkgconfig-absl-variant \
pkgconfig-gpr \
pkgconfig-grpc \
pkgconfig-grpc-unsecure \
pkgconfig-libcares \
pkgconfig-openssl \
pkgconfig-re2 \
pkgconfig-zlib"

inherit rpm
