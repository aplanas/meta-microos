SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware counters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting hardware counters statistics through libpfm."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-perfevent-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "1dc549ff21195a7376dec4b848211209123579dc62e498faf77dd39e51e356dfb73c91d87d2d747dba550bfe3f4d819858773ef063275d1842ebef1ea99b865b"

RPROVIDES:${PN} += "config-pcp-pmda-perfevent \
pcp-pmda-perfevent"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpfm.so.4"

inherit rpm
