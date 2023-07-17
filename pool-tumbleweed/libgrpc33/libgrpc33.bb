SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "libgrpc33-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "f287398592aa3c4c74d6e207da89a8385c8f1ca89c655a59e3d08a45de93ce77172f0bf2cfc3df511bf12f07bfe2a1857328b2b08cec2b186a53fb9c9b2ecddd"

RPROVIDES:${PN} += "libaddress-sorting.so.33 \
libgpr.so.33 \
libgrpc-unsecure.so.33 \
libgrpc.so.33 \
libgrpc33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
libabsl-flags-internal.so.2301.0.0 \
libabsl-flags-marshalling.so.2301.0.0 \
libabsl-flags-reflection.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-random-internal-pool-urbg.so.2301.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2301.0.0 \
libabsl-random-internal-randen-slow.so.2301.0.0 \
libabsl-random-internal-randen.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-spinlock-wait.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-statusor.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-time-zone.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libre2.so.10 \
libssl.so.3 \
libstdc++.so.6 \
libupb.so.33 \
libz.so.1"

inherit rpm
