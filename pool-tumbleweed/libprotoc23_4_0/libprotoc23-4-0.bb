SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "libprotoc23_4_0-23.4-6.1.aarch64.rpm"
RPM_HASH = "347cd397c0d97bc6e8beff2622cd217956e6effdcd2fa1f66e70982bc78d195ae4eb556776c53b4918225d8f1ba7da0d29a4a3ea2af02f39524ee92102083671"

RPROVIDES:${PN} += "libprotoc.so.23.4.0 \
libprotoc23-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-conditions.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-log-internal-nullguard.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-spinlock-wait.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-statusor.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-throw-delegate.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm
