SUMMARY = "Performance Co-Pilot (PCP) metrics for Cisco routers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Cisco routers."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-cisco-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "d25980ee4d99cd749d58d6bdf4e671d2a47bb7a652c0992818f681d671b29e39e57a77473f29e2227c8e975841300f0543a222a25726295817c7729d10b2fc43"

RPROVIDES:${PN} += "pcp-pmda-cisco"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
