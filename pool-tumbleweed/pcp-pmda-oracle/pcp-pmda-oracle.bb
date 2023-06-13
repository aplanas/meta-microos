SUMMARY = "Performance Co-Pilot (PCP) metrics for the Oracle database"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Oracle database."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-oracle-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "6995d763bbff5562bc960d89b09732ee472ceb28c228353ce841b787acaa6a1be55dc2dae83865b218b58d426d2e1b521183e0fe354d352833ffdf50d7c620dd"

RPROVIDES:${PN} += "config(pcp-pmda-oracle) \
pcp-pmda-oracle \
pcp-pmda-oracle(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
perl(DBI) \
perl-PCP-PMDA"

inherit rpm
