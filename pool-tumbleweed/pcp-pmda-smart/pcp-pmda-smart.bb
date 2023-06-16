SUMMARY = "Performance Co-Pilot (PCP) metrics for S.M.A.R.T values"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting metrics of disk S.M.A.R.T values making use of data from the \
smartmontools package."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-smart-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "21348fa66de1dba27581d0ad2826b692eb2f161c2ff4943378ac98423db86bf9d73552fc069dbb47e8e2b111c8f3ae5fe3c80c84e7c885054fb4c36bd4c945f9"

RPROVIDES:${PN} += "pcp-pmda-smart"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3"

inherit rpm
