SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "libprotobuf-lite23_4_0-23.4-6.2.aarch64.rpm"
RPM_HASH = "d695633f91f8c1cc814a44a553e016096cac03b5a8a085a52be2e7e81197a32cf8f28467bf5a8c074f49cba7c3eb3785811b6ac760790981c379bfdb621af253"

RPROVIDES:${PN} += "libprotobuf-lite.so.23.4.0 \
libprotobuf-lite23-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-log-internal-nullguard.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-throw-delegate.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
