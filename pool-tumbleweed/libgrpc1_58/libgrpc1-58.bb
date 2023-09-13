SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.58.0"

RPM_NAME = "libgrpc1_58-1.58.0-1.1.aarch64.rpm"
RPM_HASH = "867b2746a4d2e24f9ad4f975ff6bb2acf52122af67dbf101e82b2f81a3a7b0ae39193ecb99d828087acb6791b88478b59d65f4471c37d765a4de111cd3b1ab36"

RPROVIDES:${PN} += "libgrpc-authorization-provider.so.1.58 \
libgrpc-plugin-support.so.1.58 \
libgrpc1-58"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-random-internal-pool-urbg.so.2308.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2308.0.0 \
libabsl-random-internal-randen-slow.so.2308.0.0 \
libabsl-random-internal-randen.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-statusor.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-time-zone.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libcares.so.2 \
libgcc-s.so.1 \
libgpr.so.35 \
libprotobuf.so.23.4.0 \
libprotoc.so.23.4.0 \
libre2.so.11 \
libstdc++.so.6 \
libupb.so.35 \
libz.so.1"

inherit rpm
