SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "libgrpc++1_56-1.56.0-1.2.aarch64.rpm"
RPM_HASH = "8cd704e84fa61a78a118ff4c7dcf4ce894b7b4ab26ea62d87ebc5d1df11ebb7c0f9eb1f5c03c544f9b99d8837a5951636bc9e43a681db21cd6eaf1263d09be0d"

RPROVIDES:${PN} += "libgrpc++-alts.so.1.56 \
libgrpc++-error-details.so.1.56 \
libgrpc++-reflection.so.1.56 \
libgrpc++-unsecure.so.1.56 \
libgrpc++.so.1.56 \
libgrpc++1-56 \
libgrpcpp-channelz.so.1.56"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-functions.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
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
libgpr.so.33 \
libgrpc-unsecure.so.33 \
libgrpc.so.33 \
libprotobuf.so.23.3.0 \
libstdc++.so.6 \
libupb.so.33"

inherit rpm
