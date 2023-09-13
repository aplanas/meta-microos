SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools_flatzinc9-9.6-3.2.aarch64.rpm"
RPM_HASH = "5ed4045ed58aae22a7a3c55ade349f986a45168e557bde7a1060a90eec8e9c84fd054959983bd7c615d3b3afae9a5426d0770f65c2aad687ed7033d0cbf9a84e"

RPROVIDES:${PN} += "libortools-flatzinc.so.9 \
libortools-flatzinc9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-marshalling.so.2308.0.0 \
libabsl-flags-reflection.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-conditions.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-log-internal-nullguard.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-throw-delegate.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libortools.so.9 \
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm
