SUMMARY = "Performance Co-Pilot (PCP) metrics for shell command responses"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about quality of service and response time measurements of \
arbitrary shell commands."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-shping-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "9362d48f0e38de38ebd1366708e1aa11999e8c417da32c2288a9cb1c802890994a17413b3f17fd3bb84fbdfb17f187a41519c523e5591229b905be25df0ff6b7"

RPROVIDES:${PN} += "config-pcp-pmda-shping \
pcp-pmda-shping"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
