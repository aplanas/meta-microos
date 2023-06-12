SUMMARY = "Performance Co-Pilot (PCP) metrics for High Availability Clusters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about linux High Availability (HA) Clusters."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-hacluster-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "119fe5852906cc483856a47f64931411c6b1a0e78392385a4b84251c0b03cdc429ab337cff4c38d62d5f25e8bcf9cb564c72af8f04a2ecedf033de4477ba97ae"

RPROVIDES:${PN} += "pcp-pmda-hacluster \
pcp-pmda-hacluster(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp3 \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) \
pcp"

inherit rpm
