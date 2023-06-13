SUMMARY = "Performance Co-Pilot (PCP) metrics for application tracing"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about trace performance data in applications."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-trace-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "25eacb1dfcd507f6c6adf721464f2605ea965a54d85f16a334577e99f2892f776e4e55f5ed01f44fe4da36f62ef1fd0abdb04db8b200072f28333d4c8f42e9ef"

RPROVIDES:${PN} += "pcp-pmda-trace \
pcp-pmda-trace(aarch-64)"

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
libpcp_trace.so.2()(64bit) \
libpcp_trace.so.2(PCP_TRACE_2.0)(64bit)"

inherit rpm
