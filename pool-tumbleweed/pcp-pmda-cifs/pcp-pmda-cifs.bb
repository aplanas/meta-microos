SUMMARY = "Performance Co-Pilot (PCP) metrics for the CIFS protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Common Internet Filesytem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-cifs-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "e2649c4a470265689041e3280532010590eecbf5fe7d5d3e69c5e058a4ccd14a764f4755103082bbab3e2a7fcda8ee9b0e04c823bedfba6f70706853ed17573d"

RPROVIDES:${PN} += "pcp-pmda-cifs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
