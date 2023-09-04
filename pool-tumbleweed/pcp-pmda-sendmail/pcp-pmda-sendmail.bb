SUMMARY = "Performance Co-Pilot (PCP) metrics for Sendmail"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Sendmail traffic."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-sendmail-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "377d7343a68032bd48f646bde1d85071a3892cdf5ed2aa4c0ad27007c2625beabe7be97ee11c4ea8fc1a156a762be8b800949b0118dc72d34fc0d8b8201427ae"

RPROVIDES:${PN} += "pcp-pmda-sendmail"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
