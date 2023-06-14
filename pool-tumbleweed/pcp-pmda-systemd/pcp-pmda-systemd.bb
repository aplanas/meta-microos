SUMMARY = "Performance Co-Pilot (PCP) metrics from the Systemd journal"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the Systemd journal."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-systemd-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "804a65d44fedac1a74adee01cd54f568ec336042aff77966a9799868c0d1fee3c33f7aa085fbfa9d3f3621dd3e7a18c4392175ef114cfce55292cb0b37ca0ea7"

RPROVIDES:${PN} += "pcp-pmda-systemd"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libsystemd.so.0"

inherit rpm
