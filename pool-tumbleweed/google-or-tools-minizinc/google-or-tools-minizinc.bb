SUMMARY = "OR-Tools minizinc solver"
DESCRIPTION = "Minizinc solver using the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-minizinc-9.6-3.2.aarch64.rpm"
RPM_HASH = "8cb50e0179efd33f2e749bd7cbaa3102e7a6f7d37461fd392d7958d9a232323188fdf5b26a90c9d273b4224906f17492068475683b4540ce1e2fffed34a4d0da"

RPROVIDES:${PN} += "google-or-tools-minizinc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabsl-flags-internal.so.2308.0.0 \
libabsl-flags-marshalling.so.2308.0.0 \
libabsl-flags-parse.so.2308.0.0 \
libabsl-flags-reflection.so.2308.0.0 \
libabsl-flags-usage.so.2308.0.0 \
libabsl-log-initialize.so.2308.0.0 \
libabsl-log-internal-message.so.2308.0.0 \
libabsl-log-internal-nullguard.so.2308.0.0 \
libabsl-raw-hash-set.so.2308.0.0 \
libabsl-strings.so.2308.0.0 \
libabsl-time.so.2308.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libortools-flatzinc.so.9 \
libortools.so.9 \
libstdc++.so.6 \
minizinc"

inherit rpm
