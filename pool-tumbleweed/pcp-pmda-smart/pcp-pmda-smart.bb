SUMMARY = "Performance Co-Pilot (PCP) metrics for S.M.A.R.T values"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting metrics of disk S.M.A.R.T values making use of data from the \
smartmontools package."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-smart-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "32a761ff392e9b08781f3ef097e48cc9e66c6f7e1f08455a9127a18738c2a3243fa956efedfa8c496ddb2b31e6b863363f8e3f948dae09db45a4bc3eeb73709f"

RPROVIDES:${PN} += "pcp-pmda-smart"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3"

inherit rpm
