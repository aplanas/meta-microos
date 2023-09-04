SUMMARY = "Performance Co-Pilot (PCP) metrics for Cisco routers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Cisco routers."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-cisco-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "392b00d68a8908f274b00089b3818f3e06813c9a41a586b0e74c2f5c1ce24b9ac83af0e7a8d04e38e366a227624bba134b18e81babf629768fb663c4be6c76f3"

RPROVIDES:${PN} += "pcp-pmda-cisco"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
