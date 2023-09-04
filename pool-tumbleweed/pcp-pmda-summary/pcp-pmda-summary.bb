SUMMARY = "Performance Co-Pilot (PCP) summary metrics from pmie"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about other installed pmdas."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-summary-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "b40966ec762cf83c81190f1f32fecdabfd1fa92e058424b891c4d917068b32907f191e6fdf624e930b1f4aad46369a3f506e3b8c4df1bfa0d3fe8c98f32876dd"

RPROVIDES:${PN} += "config-pcp-pmda-summary \
pcp-pmda-summary"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
