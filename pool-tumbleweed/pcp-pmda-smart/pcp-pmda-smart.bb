SUMMARY = "Performance Co-Pilot (PCP) metrics for S.M.A.R.T values"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting metrics of disk S.M.A.R.T values making use of data from the \
smartmontools package."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-smart-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "db34624db1d9b3cd9dfe26b9c0576ab4a214ecbe9bc01ebe9c3f8420540896d3302f8fd2fbf12884359ebc71933532ea07cd2f57dbad3fe3d64de76f89712a8e"

RPROVIDES:${PN} += "pcp-pmda-smart"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3"

inherit rpm
