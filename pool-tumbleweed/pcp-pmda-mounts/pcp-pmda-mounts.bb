SUMMARY = "Performance Co-Pilot (PCP) metrics for filesystem mounts"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about filesystem mounts."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mounts-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "8632c136f001d1671dae5cb05958f59c46aa515b6fc81268a88779f94bdab6defb01b1fc61bf2c39833297d3d3eb8c9cfc611ff713682f81fa3f7cb6c5e30900"

RPROVIDES:${PN} += "config-pcp-pmda-mounts \
pcp-pmda-mounts"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
