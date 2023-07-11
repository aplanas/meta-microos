SUMMARY = "Performance Co-Pilot (PCP) metrics for the Oracle database"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Oracle database."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-oracle-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "4acc403191c82a3bb0875171542d168b5534cf6345c0e2bc0d3d3b997805834929047f24eb2e087e0dac8135a3cb2ceb1f3e728bb277e78b8b47025303ba45ed"

RPROVIDES:${PN} += "config-pcp-pmda-oracle \
pcp-pmda-oracle"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
perl-DBI \
perl-PCP-PMDA"

inherit rpm
