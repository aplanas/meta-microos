SUMMARY = "Performance Co-Pilot (PCP) metrics for the GFS2 filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Global Filesystem v2."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gfs2-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "129492b5d6c1c72fbc66c5e4068e7669876db1e4b11f1c62db02b31d1bf576dd06d5da95b80adeea77c9cf2e93127aec4cac2bfd7a4ba1734056083a9b75147f"

RPROVIDES:${PN} += "pcp-pmda-gfs2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
