SUMMARY = "Performance Co-Pilot (PCP) metrics for Elasticsearch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Elasticsearch."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-elasticsearch-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "3fc8bdb13b51602e622431c4c4dc36a6c2c3ac386b33044973212fd818f9ada609108674b8523903b7e8ac06f70d632da966dde9cd1de5666dde5f287d4508b4"

RPROVIDES:${PN} += "pcp-pmda-elasticsearch \
pcp-pmda-elasticsearch(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
