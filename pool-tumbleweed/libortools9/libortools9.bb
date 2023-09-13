SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools9-9.6-3.2.aarch64.rpm"
RPM_HASH = "d2e440079882bc133f4f2e6b1c1a5b886dbb15e6e849d005d6f91347b19054f3677e273105729e1c019204170ceefb92a2bb69961a0398f1b48d7c7204c26dbe"

RPROVIDES:${PN} += "libortools.so.9 \
libortools9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-die-if-null.so.2308.0.0 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-marshalling.so.2308.0.0 \
libabsl-flags-parse.so.2308.0.0 \
libabsl-flags-reflection.so.2308.0.0 \
libabsl-flags-usage.so.2308.0.0 \
libabsl-hash.so.2308.0.0 \
libabsl-int128.so.2308.0.0 \
libabsl-leak-check.so.2308.0.0 \
libabsl-log-flags.so.2308.0.0 \
libabsl-log-globals.so.2308.0.0 \
libabsl-log-initialize.so.2308.0.0 \
libabsl-log-internal-check-op.so.2308.0.0 \
libabsl-log-internal-conditions.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-log-internal-nullguard.so.2308.0.0 \
libabsl-random-distributions.so.2308.0.0 \
libabsl-random-internal-pool-urbg.so.2308.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2308.0.0 \
libabsl-random-internal-randen-slow.so.2308.0.0 \
libabsl-random-internal-randen.so.2308.0.0 \
libabsl-random-internal-seed-material.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-spinlock-wait.so.2308.0.0 \
libabsl-status.so.2308.0.0 \
libabsl-statusor.so.2308.0.0 \
libabsl-str-format-internal.so.2308.0.0 \
libabsl-strings-internal.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libabsl-throw-delegate.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf.so.23.4.0 \
libre2.so.11 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
