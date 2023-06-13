SUMMARY = "Performance Co-Pilot (PCP) metrics for the Unbound DNS Resolver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Unbound DNS Resolver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-unbound-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "9e184de3d2703d6dba2876fde7a9d497a8c5699da4b3ae087a6d57b55072d82788b867770f7dfabfa7a793e33f725aac4188b1a0982593bda0806c1d1dca727c"

RPROVIDES:${PN} += "pcp-pmda-unbound \
pcp-pmda-unbound(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
