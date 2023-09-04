SUMMARY = "Performance Co-Pilot (PCP) metrics for simple network checks"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from simple network checks."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-netcheck-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "0096dece4918f9950139d4afc24db60430093a708631a0f63140244dcb811e1f5daa78e0c5dc988edd30f5da1c94b0358776f2d942e1eda1a778b4f5db83362e"

RPROVIDES:${PN} += "pcp-pmda-netcheck"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
