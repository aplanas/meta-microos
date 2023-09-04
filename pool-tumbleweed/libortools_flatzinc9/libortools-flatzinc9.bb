SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools_flatzinc9-9.6-3.1.aarch64.rpm"
RPM_HASH = "549ef2ca38678f0cf576cc06304b573deba6769f3a72edbb875854931047109cbbfc777aefb5a8def8e49441b8566d43379ad4075af3eab559afde8794c23fc2"

RPROVIDES:${PN} += "libortools-flatzinc.so.9 \
libortools-flatzinc9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2301.0.0 \
libabsl-flags-marshalling.so.2301.0.0 \
libabsl-flags-reflection.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-conditions.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-log-internal-nullguard.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-throw-delegate.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libortools.so.9 \
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm
