SUMMARY = "Performance Co-Pilot (PCP) metrics for filesystem mounts"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about filesystem mounts."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mounts-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "34326ff27d908c0391dea2b22cc350facd5dec07205cc557e8fcae46a23eeb1efc7d6c88ff108ba874e26a51b7414e38f94cbb7e7120f50fe3874f460a66681b"

RPROVIDES:${PN} += "config-pcp-pmda-mounts \
pcp-pmda-mounts"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
