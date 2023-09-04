SUMMARY = "Performance Co-Pilot (PCP) metrics for application tracing"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about trace performance data in applications."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-trace-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "e14a598d4c1a7677117b32d5d27c7aba5908ec1f18cff7e97693f255fa5a8571d06ae452fd2fcfb68939938fbdb5c78ddf926fb4d9cd76be41474fcaa5567ecf"

RPROVIDES:${PN} += "pcp-pmda-trace"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-trace.so.2 \
libpcp.so.3"

inherit rpm
