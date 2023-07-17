SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "libprotobuf23_4_0-23.4-6.1.aarch64.rpm"
RPM_HASH = "082efd4d88e88a24535825a58a5942bc1cf7fa6ff1e3356c854d79b91060ee3fb9417ce00d49a8532f3e543d630ef581298f05a76c76eae30efb32226d7e072b"

RPROVIDES:${PN} += "libprotobuf.so.23.4.0 \
libprotobuf23-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
libabsl-die-if-null.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
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
libabsl-time-zone.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
