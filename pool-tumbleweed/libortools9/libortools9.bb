SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "libortools9-9.6-1.1.aarch64.rpm"
RPM_HASH = "994a223ab5782f3372a2b4e5759c5f84c1569f732464e1d49081de33dee6e4e7758b0bf62aa54c59228ef8158c3691faed9b8900fc000d630f12d82c292140ee"

RPROVIDES:${PN} += "libortools.so.9 \
libortools9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-die-if-null.so.2301.0.0 \
libabsl-flags-internal.so.2301.0.0 \
libabsl-flags-marshalling.so.2301.0.0 \
libabsl-flags-parse.so.2301.0.0 \
libabsl-flags-reflection.so.2301.0.0 \
libabsl-flags-usage.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-int128.so.2301.0.0 \
libabsl-leak-check.so.2301.0.0 \
libabsl-log-flags.so.2301.0.0 \
libabsl-log-globals.so.2301.0.0 \
libabsl-log-initialize.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-conditions.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-log-internal-nullguard.so.2301.0.0 \
libabsl-random-distributions.so.2301.0.0 \
libabsl-random-internal-pool-urbg.so.2301.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2301.0.0 \
libabsl-random-internal-randen-slow.so.2301.0.0 \
libabsl-random-internal-randen.so.2301.0.0 \
libabsl-random-internal-seed-material.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-statusor.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-throw-delegate.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-3.21.12.so \
libre2.so.10 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
