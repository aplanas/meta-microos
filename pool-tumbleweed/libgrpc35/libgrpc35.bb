SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.58.0"

RPM_NAME = "libgrpc35-1.58.0-1.1.aarch64.rpm"
RPM_HASH = "ac714bbbcab8c4bb82208b4efa84c1aaae6852b32ed717025410653edb3b7a7afe422353ce9645a3340803ebed22d231f6ccc536d0fcc1a6a366d24284a5a9a3"

RPROVIDES:${PN} += "libaddress-sorting.so.35 \
libgpr.so.35 \
libgrpc-unsecure.so.35 \
libgrpc.so.35 \
libgrpc35 \
libutf8-range-lib.so.35"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-marshalling.so.2308.0.0 \
libabsl-flags-reflection.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-random-internal-pool-urbg.so.2308.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2308.0.0 \
libabsl-random-internal-randen-slow.so.2308.0.0 \
libabsl-random-internal-randen.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-spinlock-wait.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-statusor.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-time-zone.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libre2.so.11 \
libssl.so.3 \
libstdc++.so.6 \
libupb-collections-lib.so.35 \
libupb-json-lib.so.35 \
libupb-textformat-lib.so.35 \
libupb.so.35 \
libz.so.1"

inherit rpm
