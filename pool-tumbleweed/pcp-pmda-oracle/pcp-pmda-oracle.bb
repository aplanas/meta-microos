SUMMARY = "Performance Co-Pilot (PCP) metrics for the Oracle database"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Oracle database."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-oracle-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "668f51ec80826727e88a300b3ceba33a752d57a04697aac81dd8b6534f1c86e032d7b9fd0790ec4ad27a21489159a9b3328c56607b800e5206b1fc1d3d607ab8"

RPROVIDES:${PN} += "config-pcp-pmda-oracle \
pcp-pmda-oracle"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
perl-DBI \
perl-PCP-PMDA"

inherit rpm
