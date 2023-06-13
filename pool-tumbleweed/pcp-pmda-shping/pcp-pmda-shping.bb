SUMMARY = "Performance Co-Pilot (PCP) metrics for shell command responses"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about quality of service and response time measurements of \
arbitrary shell commands."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-shping-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "496d51a304ccdf3717914fbb16f786afe3f2568d0d2036dd1bb85aecd9584d2825d57196254f9b075c0d64fc1ae81cc23c7c02d02aa802b7db432884e4d0df03"

RPROVIDES:${PN} += "config(pcp-pmda-shping) \
pcp-pmda-shping \
pcp-pmda-shping(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcp.so.3()(64bit) \
libpcp_pmda.so.3()(64bit)"

inherit rpm
