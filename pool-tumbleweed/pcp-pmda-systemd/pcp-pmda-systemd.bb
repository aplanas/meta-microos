SUMMARY = "Performance Co-Pilot (PCP) metrics from the Systemd journal"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the Systemd journal."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-systemd-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "3ff5f30bddbd462b2a0fc651863bde1e17a6305e9a126b8ac3c190f08a402533f515372b3bcde963f68aa7c847ca8071e798558417d89f7553428f259a4bd238"

RPROVIDES:${PN} += "pcp-pmda-systemd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libsystemd.so.0"

inherit rpm
