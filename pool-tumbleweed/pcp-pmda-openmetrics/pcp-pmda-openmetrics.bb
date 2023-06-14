SUMMARY = "Performance Co-Pilot (PCP) metrics from OpenMetrics endpoints"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting metrics from OpenMetrics (https://openmetrics.io/) endpoints."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-openmetrics-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "36552729ed11b602c4c07848aae3d069776970d348d55fa05c8d7f77665a908abc893634699690f5903718ecac3dfa2c2e86a9a4569c6efe7551d99b6a8a5d5e"

RPROVIDES:${PN} += "config-pcp-pmda-openmetrics \
pcp-pmda-openmetrics \
pcp-pmda-prometheus"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp \
python3-requests"

inherit rpm
