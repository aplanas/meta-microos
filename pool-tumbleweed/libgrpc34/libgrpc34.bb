SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "libgrpc34-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "3ce8df1c1c66572d1e807e84161e7bbd5a1f0bebd801735343369c479742adcdaf498632738e4faef0f122ab427d7983de023872966f8996c6f25b9baf206980"

RPROVIDES:${PN} += "libaddress-sorting.so.34 \
libgpr.so.34 \
libgrpc-unsecure.so.34 \
libgrpc.so.34 \
libgrpc34"

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
libre2.so.11 \
libssl.so.3 \
libstdc++.so.6 \
libupb.so.34 \
libz.so.1"

inherit rpm
