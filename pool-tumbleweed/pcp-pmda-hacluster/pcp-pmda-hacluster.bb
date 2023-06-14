SUMMARY = "Performance Co-Pilot (PCP) metrics for High Availability Clusters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about linux High Availability (HA) Clusters."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-hacluster-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "119fe5852906cc483856a47f64931411c6b1a0e78392385a4b84251c0b03cdc429ab337cff4c38d62d5f25e8bcf9cb564c72af8f04a2ecedf033de4477ba97ae"

RPROVIDES:${PN} += "pcp-pmda-hacluster"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
pcp"

inherit rpm
