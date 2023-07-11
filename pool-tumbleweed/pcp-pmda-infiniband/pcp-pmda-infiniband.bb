SUMMARY = "Performance Co-Pilot (PCP) metrics for Infiniband HCAs and switches"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting Infiniband statistics.  By default, it monitors the local HCAs \
but can also be configured to monitor remote GUIDs such as IB switches."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-infiniband-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "4008034671e80825df2cfbb05ca2f1644cd762141e664f747f973d9c457e06079ff8cc016d915c7bece136641d6c252429d8182f336393ac274f2a2c981ce659"

RPROVIDES:${PN} += "pcp-pmda-infiniband"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibmad.so.5 \
libibumad.so.3 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
