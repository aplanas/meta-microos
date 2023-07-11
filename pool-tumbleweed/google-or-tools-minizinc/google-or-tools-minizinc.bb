SUMMARY = "OR-Tools minizinc solver"
DESCRIPTION = "Minizinc solver using the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-minizinc-9.6-1.2.aarch64.rpm"
RPM_HASH = "796c64147f27ce498240c6eb65f3e2d989541d2319594944429ba8feee7ff6e9fb3556e7bc5d56bb23d5f245d3fe8bb11786233208ce378c815a5ea85fa2547a"

RPROVIDES:${PN} += "google-or-tools-minizinc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2301.0.0 \
libabsl-flags-marshalling.so.2301.0.0 \
libabsl-flags-parse.so.2301.0.0 \
libabsl-flags-reflection.so.2301.0.0 \
libabsl-flags-usage.so.2301.0.0 \
libabsl-log-initialize.so.2301.0.0 \
libabsl-log-internal-message.so.2301.0.0 \
libabsl-log-internal-nullguard.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-time.so.2301.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libortools-flatzinc.so.9 \
libortools.so.9 \
libstdc++.so.6 \
minizinc"

inherit rpm
