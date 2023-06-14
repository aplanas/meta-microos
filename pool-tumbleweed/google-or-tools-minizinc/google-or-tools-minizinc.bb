SUMMARY = "OR-Tools minizinc solver"
DESCRIPTION = "Minizinc solver using the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-minizinc-9.6-1.1.aarch64.rpm"
RPM_HASH = "2c36e40ddb9838793ed1d5709d1753e1a8e29b5bdb12aab80a29964a1a8548bce9a2e526bb65f41b00209cdbccb0b26250f97c641a946aa70ce289283480f6ae"

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
