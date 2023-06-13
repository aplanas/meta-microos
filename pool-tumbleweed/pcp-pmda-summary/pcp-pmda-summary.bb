SUMMARY = "Performance Co-Pilot (PCP) summary metrics from pmie"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about other installed pmdas."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-summary-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "1da1ddfb61f51c2b8697c0d43d8e9e66e78ba3677e429661bd80709d0267578f68c2c07d2c9f778d81f4589da626de95cc79497823d988d1c0ecfce63fb32e54"

RPROVIDES:${PN} += "config(pcp-pmda-summary) \
pcp-pmda-summary \
pcp-pmda-summary(aarch-64)"

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
pcp"

inherit rpm
