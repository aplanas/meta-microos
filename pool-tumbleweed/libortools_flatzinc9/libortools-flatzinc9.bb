SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools_flatzinc9-9.6-2.1.aarch64.rpm"
RPM_HASH = "cb2bc17e18fd5de761766c050748016f38fb87014f03256dfec72d16d1372bdda74c3200bd91fd6a0ecb28610a105404055974566fbfbe3ebc5097a1dffc66a0"

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
