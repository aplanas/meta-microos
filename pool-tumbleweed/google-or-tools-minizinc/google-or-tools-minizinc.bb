SUMMARY = "OR-Tools minizinc solver"
DESCRIPTION = "Minizinc solver using the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.6"

RPM_NAME = "google-or-tools-minizinc-9.6-2.1.aarch64.rpm"
RPM_HASH = "58d6a6fac50ce8115f22d6ae4fad63f5a1fa0d47cdf6fea9e7867c2a62709e9ca6afa3e13883910ebaccbc461e8e045a6f29882a5cc423c78633d1a767e9bcc9"

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
