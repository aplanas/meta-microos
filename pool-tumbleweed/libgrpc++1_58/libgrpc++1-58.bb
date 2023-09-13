SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.58.0"

RPM_NAME = "libgrpc++1_58-1.58.0-1.1.aarch64.rpm"
RPM_HASH = "904f86f280d6979925e9ad2232bccc388c7ed4789456381d66993bcaadfafede0f97c8f1b9ad68ce56b96b322980ef406ecacaf6c359e25ea2378bfface57b05"

RPROVIDES:${PN} += "libgrpc++-alts.so.1.58 \
libgrpc++-error-details.so.1.58 \
libgrpc++-reflection.so.1.58 \
libgrpc++-unsecure.so.1.58 \
libgrpc++.so.1.58 \
libgrpc++1-58 \
libgrpcpp-channelz.so.1.58"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-functions.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-statusor.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.35 \
libgrpc-unsecure.so.35 \
libgrpc.so.35 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libupb-collections-lib.so.35 \
libupb.so.35"

inherit rpm
