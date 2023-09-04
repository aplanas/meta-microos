SUMMARY = "Performance Co-Pilot (PCP) metrics for High Availability Clusters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about linux High Availability (HA) Clusters."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-hacluster-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "34111e50b8e66b23a40c0a84104da4202272af796124f9122d841f6124d27949184a48993a5a6ff9abcb0d88337bb783a99dcdf78e7bb345b3b67e3ad5147952"

RPROVIDES:${PN} += "pcp-pmda-hacluster"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
pcp"

inherit rpm
