SUMMARY = "Performance Co-Pilot (PCP) metrics from OpenMetrics endpoints"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting metrics from OpenMetrics (https://openmetrics.io/) endpoints."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-openmetrics-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "fc19187f502b7ddc8ba37f6b3a8954ef8b6e0aaf8132d47e2693fb292ebd27e2670108593644256e36caa6949334e2afa12b820aa8932b80cc0fa17cbc75d995"

RPROVIDES:${PN} += "config-pcp-pmda-openmetrics \
pcp-pmda-openmetrics \
pcp-pmda-prometheus"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp \
python3-requests"

inherit rpm
