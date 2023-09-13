SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "libprotoc23_4_0-23.4-6.2.aarch64.rpm"
RPM_HASH = "dac2eed61742394489265e329a52e4fbd02865e7b2f4dcd1a5280128b37a73824ec8a8dbe6b3102651825dd1e6fc3ea70a203583c46a796a0067a04507e9434f"

RPROVIDES:${PN} += "libprotoc.so.23.4.0 \
libprotoc23-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-conditions.so.2308.0.0 \
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
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm
