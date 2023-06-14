SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "OR-Tools is an open source software suite for optimization, tuned for \
tackling the world's toughest problems in vehicle routing, flows, \
integer and linear programming, and constraint programming."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-9.6-1.1.aarch64.rpm"
RPM_HASH = "b164e25a65c4150798dc120a10b6624030252946cb372642b66f45386c7571eaa9bd14d2e370f6001f8f5a5d48b662318e64e950ce47bba99b6343ce31f92b16"

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
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
