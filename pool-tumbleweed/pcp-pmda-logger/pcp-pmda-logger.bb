SUMMARY = "Performance Co-Pilot (PCP) metrics from arbitrary log files"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a specified set of log files (or pipes).  The PMDA \
supports both sampled and event-style metrics."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-logger-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "4631bd5406f58f5cd0055aff6b7aea097135b426e3232f0e050be48b47dac5df570d9b5c3c0e816f8b4bbf59358ce417aaaccaffa1161c6d8125ab836dee12b0"

RPROVIDES:${PN} += "pcp-pmda-logger \
pcp-pmda-logger(aarch-64)"
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
libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit)"

inherit rpm
