SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware counters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting hardware counters statistics through libpfm."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-perfevent-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "1802766212631968fb76feea965cb17bf890792331b543bdf7ea3b5c77067847517470412bb17656f6789f227e0a4222cda80ef40c1d8bd3b52349eacfd502f7"

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
