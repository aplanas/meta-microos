SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "libgrpc1_54-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "9f14330d33eb5105601d25445d9e83718e04fe19aec37cb208a975ef0b9f0ca719507b9fd26b6f5a8dab146f2e0c59a7fccd05de629a864e1414aead879a019d"

RPROVIDES:${PN} += "libgrpc1_54 \
libgrpc1_54(aarch-64) \
libgrpc_authorization_provider.so.1.54()(64bit) \
libgrpc_plugin_support.so.1.54()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libabsl_cord.so.2301.0.0()(64bit) \
libabsl_cordz_info.so.2301.0.0()(64bit) \
libabsl_hash.so.2301.0.0()(64bit) \
libabsl_raw_hash_set.so.2301.0.0()(64bit) \
libabsl_status.so.2301.0.0()(64bit) \
libabsl_statusor.so.2301.0.0()(64bit) \
libabsl_str_format_internal.so.2301.0.0()(64bit) \
libabsl_strings.so.2301.0.0()(64bit) \
libabsl_synchronization.so.2301.0.0()(64bit) \
libabsl_time.so.2301.0.0()(64bit) \
libabsl_time_zone.so.2301.0.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgpr.so.31()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libprotoc-3.21.12.so()(64bit) \
libre2.so.10()(64bit) \
libstdc++.so.6()(64bit) \
libupb.so.31()(64bit) \
libz.so.1()(64bit)"

inherit rpm
