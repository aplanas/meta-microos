SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "libprotobuf23_4_0-23.4-6.2.aarch64.rpm"
RPM_HASH = "631cb66902b6c74fd0967db9fac3cd35c486cc63f8eaa3099fd97e2b0db1e34fdc05268a396ecadcb0469e7b6057bbff60489622903b4c2920fe16c525495381"

RPROVIDES:${PN} += "libprotobuf.so.23.4.0 \
libprotobuf23-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-die-if-null.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-log-internal-nullguard.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-spinlock-wait.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-statusor.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-throw-delegate.so.2308.0.0 \
libabsl-time-zone.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
