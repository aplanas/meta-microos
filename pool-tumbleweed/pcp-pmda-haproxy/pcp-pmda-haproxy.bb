SUMMARY = "Performance Co-Pilot (PCP) metrics for HAProxy"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
extracting performance metrics from HAProxy over the HAProxy stats socket."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-haproxy-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "cd8654ce73611799c9f51c9ed9cf6a5d46d8ac3de0cc31c765bec78f56b26be133c97a7385b39a958eb8dffc13d72cf5fd6f9635df1eea8a3fbefdec195e46b0"

RPROVIDES:${PN} += "pcp-pmda-haproxy"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
