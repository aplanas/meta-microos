SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization, tuned for \
tackling the world's toughest problems in vehicle routing, flows, \
integer and linear programming, and constraint programming."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-9.6-3.1.aarch64.rpm"
RPM_HASH = "cc835b638e216be70c87eec0b3471e32354483b0f96c1b6476756a33029bc6848ded5368e79401a709088ca169550dbc61571868d4d1a1be8464b3cb3fc05f4e"

RPROVIDES:${PN} += "google-or-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2301.0.0 \
libabsl-flags-marshalling.so.2301.0.0 \
libabsl-flags-parse.so.2301.0.0 \
libabsl-flags-reflection.so.2301.0.0 \
libabsl-flags-usage.so.2301.0.0 \
libabsl-hash.so.2301.0.0 \
libabsl-log-flags.so.2301.0.0 \
libabsl-log-initialize.so.2301.0.0 \
libabsl-log-internal-check-op.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-log-internal-nullguard.so.2301.0.0 \
libabsl-random-internal-pool-urbg.so.2301.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2301.0.0 \
libabsl-random-internal-randen-slow.so.2301.0.0 \
libabsl-random-internal-randen.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libortools.so.9 \
libprotobuf.so.23.4.0 \
libstdc++.so.6"

inherit rpm
