SUMMARY = "Performance Co-Pilot (PCP) metrics for compressed swap"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about compressed swap."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-zswap-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "8a17f35a6d5c597a657a58b627a030db25dd25dd9115f739a87f1bbdef6a9ee219ed98726d9f00e70bf6be61c380040de1278c73c7d2027b5aa87fe6033cf3dd"

RPROVIDES:${PN} += "pcp-pmda-zswap"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
