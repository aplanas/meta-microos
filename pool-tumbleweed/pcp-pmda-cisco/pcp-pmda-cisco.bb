SUMMARY = "Performance Co-Pilot (PCP) metrics for Cisco routers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Cisco routers."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-cisco-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "b5fa6ddfc79baeac9d15b81b383a3212bf4c4a0dfe10c8ac86ad5f5e9996f462490472e6f8d6d3626dd518551882aee12bf9dca001f82b0f9ff28d420a4b5a28"

RPROVIDES:${PN} += "pcp-pmda-cisco \
pcp-pmda-cisco(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp.so.3(PCP_3.4)(64bit) \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit)"

inherit rpm