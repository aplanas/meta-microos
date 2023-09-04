SUMMARY = "OR-Tools minizinc solver"
DESCRIPTION = "Minizinc solver using the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-minizinc-9.6-3.1.aarch64.rpm"
RPM_HASH = "ba559eef28367f1e8b3dae23043b23ca51207150f29b0e8a267324df1b3b11055833935e293bff9a82fd585f835bd5d022d9d6fb4fbc46e8509cf72d035d73e0"

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
