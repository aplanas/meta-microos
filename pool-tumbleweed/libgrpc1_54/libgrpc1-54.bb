SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "libgrpc1_54-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "9f14330d33eb5105601d25445d9e83718e04fe19aec37cb208a975ef0b9f0ca719507b9fd26b6f5a8dab146f2e0c59a7fccd05de629a864e1414aead879a019d"

RPROVIDES:${PN} += "libgrpc-authorization-provider.so.1.54 \
libgrpc-plugin-support.so.1.54 \
libgrpc1-54"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-statusor.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-time-zone.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.31 \
libprotobuf-3.21.12.so \
libprotoc-3.21.12.so \
libre2.so.10 \
libstdc++.so.6 \
libupb.so.31 \
libz.so.1"

inherit rpm
