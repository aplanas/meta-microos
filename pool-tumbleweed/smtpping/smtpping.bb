SUMMARY = "A tool for measuring SMTP server delay, delay variation and throughput"
DESCRIPTION = "A tool for measuring SMTP server delay, delay variation and throughput."
LICENSE = "GPL-2.0-only"

PV = "1.1.4"

RPM_NAME = "smtpping-1.1.4-1.8.aarch64.rpm"
RPM_HASH = "2cac56369cf6d22220cd0f9b78cc70740622cd7c8694d4de476eeae8e2816ff669fa7e0dd27b873026a5d4701e3520b4b29d1f9cb659e6c2b6c27d528760e135"

RPROVIDES:${PN} += "smtpping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
