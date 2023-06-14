SUMMARY = "Performance Co-Pilot (PCP) per-socket metrics"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting per-socket statistics, making use of utilities such as 'ss'."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-sockets-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "15536a3ee06c64f3fe56cb9950f61571495ad9da3ab39f4b08a1333dfa605ba1d6ee3c6c9a44ccb80989a2e0e5ec32a711e00a2104fee6264595a78a3668f4e8"

RPROVIDES:${PN} += "pcp-pmda-sockets"

RDEPENDS:${PN} += "/bin/sh \
iproute \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
pcp"

inherit rpm
