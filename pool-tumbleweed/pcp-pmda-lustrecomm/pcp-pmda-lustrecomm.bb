SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem Comms"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem Comms."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lustrecomm-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "4835a5301cf1b92936816a0758a3642fd4922891a969f9886d777922a9692877e49432420be22be03cb2d3ab03e6d8ac1b0d8e122094c78e17d798ac17128f88"

RPROVIDES:${PN} += "pcp-pmda-lustrecomm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
