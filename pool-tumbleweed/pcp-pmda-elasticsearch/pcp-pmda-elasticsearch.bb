SUMMARY = "Performance Co-Pilot (PCP) metrics for Elasticsearch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Elasticsearch."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-elasticsearch-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "3e1e04faccb39ab7e9dca73f6db7e97faa7c643411d203f50d5817305f1c2ffe218d6ec4e9b00033fa8c209efbdea57bceb1d3d910ef72d3850267d5918f5a8e"

RPROVIDES:${PN} += "pcp-pmda-elasticsearch"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
