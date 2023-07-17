SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "libgrpc1_56-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "6460edeaa96807c03441edff4bd8a6c3f73242bfbb68e0c873c3dae4eaf844d706b2f885d639ef4023fb147125a729700dce40f12e86b18d81810659e7463045"

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
