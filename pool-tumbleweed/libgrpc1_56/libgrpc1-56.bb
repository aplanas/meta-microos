SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.56.2"

RPM_NAME = "libgrpc1_56-1.56.2-1.1.aarch64.rpm"
RPM_HASH = "eb0dbce877b98b82615cdbdcfcc2711404c30a6ed6de189d4d4e01ca9eee8050f5e6f3f191f485546dfe26535e49f7d4b3e6a68ba6a0b0f0ef7269b3c24301fb"

RPROVIDES:${PN} += "libgrpc-authorization-provider.so.1.56 \
libgrpc-plugin-support.so.1.56 \
libgrpc1-56"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-random-internal-pool-urbg.so.2301.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2301.0.0 \
libabsl-random-internal-randen-slow.so.2301.0.0 \
libabsl-random-internal-randen.so.2301.0.0 \
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
libgpr.so.33 \
libprotobuf.so.23.4.0 \
libprotoc.so.23.4.0 \
libre2.so.10 \
libstdc++.so.6 \
libupb.so.33 \
libz.so.1"

inherit rpm
