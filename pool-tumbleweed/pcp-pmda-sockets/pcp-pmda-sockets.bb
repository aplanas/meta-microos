SUMMARY = "Performance Co-Pilot (PCP) per-socket metrics"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting per-socket statistics, making use of utilities such as 'ss'."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-sockets-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "7e2684243ccda2a4bd43c909b7d88a20d8be1eea2a9b5d203823720337a1bc44da51252714efb95ba02f5b0c6af03afb737412916312ed4a626986c0ffd2ade7"

RPROVIDES:${PN} += "pcp-pmda-sockets"

RDEPENDS:${PN} += "/usr/bin/sh \
iproute \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
pcp"

inherit rpm
