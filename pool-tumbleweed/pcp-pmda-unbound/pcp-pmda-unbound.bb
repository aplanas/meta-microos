SUMMARY = "Performance Co-Pilot (PCP) metrics for the Unbound DNS Resolver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Unbound DNS Resolver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-unbound-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "f5572c55ba121fd8c8eecbf189bf2303e6cacf610452158538f20374da32608e59801db311f5ec64bf6020ec1f6ba5d6d2501a67a65e84dec10832325b3b3088"

RPROVIDES:${PN} += "pcp-pmda-unbound"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
