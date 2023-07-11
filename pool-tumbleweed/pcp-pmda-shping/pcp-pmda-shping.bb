SUMMARY = "Performance Co-Pilot (PCP) metrics for shell command responses"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about quality of service and response time measurements of \
arbitrary shell commands."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-shping-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "075cf4bd1a7662ace702be2eb7efd1ccc09b1fcf158b30d401f40b9eb79242fee54e044a0c610fdca81ecbd99d57935bd43b3674002d31dbee1a6733f5646091"

RPROVIDES:${PN} += "config-pcp-pmda-shping \
pcp-pmda-shping"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
