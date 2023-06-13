SUMMARY = "Performance Co-Pilot (PCP) metrics for Infiniband HCAs and switches"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting Infiniband statistics.  By default, it monitors the local HCAs \
but can also be configured to monitor remote GUIDs such as IB switches."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-infiniband-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "18bd7df3d5d898e135ffff737e5297d7eb1715bfb49760683b13158f037a51ac4f15bae5e0049d3bb8662238d9af4c20a36d19eb2c83d5292ad1a0caaf3babd7"

RPROVIDES:${PN} += "pcp-pmda-infiniband \
pcp-pmda-infiniband(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libibmad.so.5()(64bit) \
libibumad.so.3()(64bit) \
libpcp.so.3()(64bit) \
libpcp_pmda.so.3()(64bit)"

inherit rpm
