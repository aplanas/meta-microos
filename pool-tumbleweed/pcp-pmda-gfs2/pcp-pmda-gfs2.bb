SUMMARY = "Performance Co-Pilot (PCP) metrics for the GFS2 filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Global Filesystem v2."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gfs2-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "3089d07ca1764f27d977e3c75b9a2822a3869e0d6b1246eb0d1aac753e57c7cc88230278eee1dc2b6107d89a84d96e3b3f35baef6a87c1b017bd523243cb329a"

RPROVIDES:${PN} += "pcp-pmda-gfs2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
