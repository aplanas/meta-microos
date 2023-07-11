SUMMARY = "Performance Co-Pilot (PCP) metrics for application tracing"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about trace performance data in applications."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-trace-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "3dcf7e1cdfa179e0a64d96c7c813e2e6f298e334f9b6badadd520359004e201e4fe5ba1c6e03ac4b0a7e3481a9d40d4744055783265474b0a25dad1673e86b6a"

RPROVIDES:${PN} += "pcp-pmda-trace"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-trace.so.2 \
libpcp.so.3"

inherit rpm
