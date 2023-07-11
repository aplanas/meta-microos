SUMMARY = "Performance Co-Pilot (PCP) metrics for Elasticsearch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Elasticsearch."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-elasticsearch-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "76392b6f4d5cff1207eedb5c31afbc82ed3ff6bbcbcca729523ee9596e28921df9ad04af7acf888df4b216c8657f3561ede126447a30d3022630fe076030e953"

RPROVIDES:${PN} += "pcp-pmda-elasticsearch"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
