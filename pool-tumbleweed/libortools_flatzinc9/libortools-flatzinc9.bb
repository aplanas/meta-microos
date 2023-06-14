SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools_flatzinc9-9.6-1.1.aarch64.rpm"
RPM_HASH = "a0e53e96467bfc86de55c2feae372e68a49b685e885f5408da87701190d9fe94030c318ca8e06c4f4a021a77ea91657308dd402a11be2a230f9369efa0091ce5"

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
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
