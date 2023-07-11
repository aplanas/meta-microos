SUMMARY = "Performance Co-Pilot (PCP) metrics for JSON data"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics output in JSON."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-json-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "012d0bc96ae662a06d529f38c9c9919ae45c901386e936a43c0cc4b93b199936cf5ece2bff4b9fbb0facd735096e512803d1bbb077051e6fdc0cb3eb6685c179"

RPROVIDES:${PN} += "config-pcp-pmda-json \
pcp-pmda-json"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-jsonpointer \
python3-pcp \
python3-six"

inherit rpm
