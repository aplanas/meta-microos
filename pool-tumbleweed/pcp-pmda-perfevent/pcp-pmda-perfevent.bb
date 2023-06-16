SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware counters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting hardware counters statistics through libpfm."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-perfevent-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "ecc80c496ebed706c605b70e2370d531f2fc890f373ce29ec8f0cc799430a3764380d74c11c456ba593ed3d03a4928ad8323271f952721e6a72c8f355e375d1f"

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
