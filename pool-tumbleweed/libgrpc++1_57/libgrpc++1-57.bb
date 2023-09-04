SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.57.0"

RPM_NAME = "libgrpc++1_57-1.57.0-1.1.aarch64.rpm"
RPM_HASH = "a63ff951762bb7913b592edc0d53d2a51faa07f32e4aca60c0d055c3b3d3039d4187a7349336811b837fa3796486da25526485ef1e0f330fc34164c4efebdaed"

RPROVIDES:${PN} += "libgrpc++-alts.so.1.57 \
libgrpc++-error-details.so.1.57 \
libgrpc++-reflection.so.1.57 \
libgrpc++-unsecure.so.1.57 \
libgrpc++.so.1.57 \
libgrpc++1-57 \
libgrpcpp-channelz.so.1.57"

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
libgpr.so.34 \
libgrpc-unsecure.so.34 \
libgrpc.so.34 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libupb.so.34"

inherit rpm
