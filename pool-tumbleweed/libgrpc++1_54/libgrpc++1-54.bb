SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "libgrpc++1_54-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "0845b817db46b5ff98bea34b85368a8326497b5795c3896c7752f5544f9919b9a86b27b17d01911c2a0707bac1142683e0f040fef6e2c02c74d1dbbca4e58676"

RPROVIDES:${PN} += "libgrpc++-alts.so.1.54 \
libgrpc++-error-details.so.1.54 \
libgrpc++-reflection.so.1.54 \
libgrpc++-unsecure.so.1.54 \
libgrpc++.so.1.54 \
libgrpc++1-54 \
libgrpcpp-channelz.so.1.54"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-statusor.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.31 \
libgrpc-unsecure.so.31 \
libgrpc.so.31 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libupb.so.31"

inherit rpm
