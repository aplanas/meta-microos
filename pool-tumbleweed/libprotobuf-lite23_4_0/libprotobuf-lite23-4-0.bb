SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "23.4"

RPM_NAME = "libprotobuf-lite23_4_0-23.4-6.1.aarch64.rpm"
RPM_HASH = "1513a48c78018c42ce7792c0587cbb3602335ae5dc62712a695aff8997d486db93093b6284475bb32b5f90eb2e4c943aaff3cdb9ef925c6be54932eee97a286b"

RPROVIDES:${PN} += "libprotobuf-lite.so.23.4.0 \
libprotobuf-lite23-4-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-log-internal-nullguard.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-throw-delegate.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
