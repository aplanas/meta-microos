SUMMARY = "Performance Co-Pilot (PCP) metrics from the Systemd journal"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the Systemd journal."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-systemd-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "fccc85c62b35822ddc0df7418e81598c23eef4f2a1d3325a9a6178f7dc1a2829f03603d693db5b041f67def187c657bd545c024ca197828ae070a742e0726ed3"

RPROVIDES:${PN} += "pcp-pmda-systemd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libsystemd.so.0"

inherit rpm
