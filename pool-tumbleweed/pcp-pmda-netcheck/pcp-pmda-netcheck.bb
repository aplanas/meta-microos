SUMMARY = "Performance Co-Pilot (PCP) metrics for simple network checks"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from simple network checks."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-netcheck-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "05a8a87f99a7e733d46e8e7bfb1d1152c3268c034007091ab8d560e2a10089c5a3a54f4d8a0522c6988be1c5c33e9eb89f9bbf25994bc95200f691345d01d212"

RPROVIDES:${PN} += "pcp-pmda-netcheck \
pcp-pmda-netcheck(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
