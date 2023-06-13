SUMMARY = "Performance Co-Pilot (PCP) metrics for the GFS2 filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Global Filesystem v2."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gfs2-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "129492b5d6c1c72fbc66c5e4068e7669876db1e4b11f1c62db02b31d1bf576dd06d5da95b80adeea77c9cf2e93127aec4cac2bfd7a4ba1734056083a9b75147f"

RPROVIDES:${PN} += "pcp-pmda-gfs2 \
pcp-pmda-gfs2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit)"

inherit rpm
