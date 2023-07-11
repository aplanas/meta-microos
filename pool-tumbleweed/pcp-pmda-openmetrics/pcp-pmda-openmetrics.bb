SUMMARY = "Performance Co-Pilot (PCP) metrics from OpenMetrics endpoints"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting metrics from OpenMetrics (https://openmetrics.io/) endpoints."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-openmetrics-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "531826efc96536f674af07b8942a9e9a26c3803a20f3a729e785f0ad8e75515a59678e877c35a86e3f62f308d588e8de338d2e126c98d9fbdf0a23f40e298f1d"

RPROVIDES:${PN} += "config-pcp-pmda-openmetrics \
pcp-pmda-openmetrics \
pcp-pmda-prometheus"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp \
python3-requests"

inherit rpm
