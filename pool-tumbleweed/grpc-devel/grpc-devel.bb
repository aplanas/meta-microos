SUMMARY = "Development files for grpc, a HTTP/2 Remote Procedure Call implementation"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "grpc-devel-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "61162e6b08cb4da0c3c532a2174c82413cbe4213c0c2f90bada12b77fadb9ab481b1133939072c2d551f6799aeb41fc49e0c9c45e00c76274cf01c7d768a01cb"

RPROVIDES:${PN} += "cmake-gRPC \
grpc-devel \
pkgconfig-gpr \
pkgconfig-grpc \
pkgconfig-grpc++ \
pkgconfig-grpc++-unsecure \
pkgconfig-grpc-unsecure"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgrpc++1-54 \
libgrpc-plugin-support.so.1.54 \
libgrpc1-54 \
libgrpc31 \
libprotobuf-3.21.12.so \
libprotoc-3.21.12.so \
libstdc++.so.6 \
libupb31 \
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
