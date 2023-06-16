SUMMARY = "Performance Co-Pilot (PCP) metrics for JSON data"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics output in JSON."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-json-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "65ea7cf1655a58b3a7ea50d64ac511116b8008f8b13355870afebce7d2e54e72ead6aa51afef904506616d2754301c8b3222a71f197701a7dfefa269c8a1f8f4"

RPROVIDES:${PN} += "config-pcp-pmda-json \
pcp-pmda-json"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-jsonpointer \
python3-pcp \
python3-six"

inherit rpm
