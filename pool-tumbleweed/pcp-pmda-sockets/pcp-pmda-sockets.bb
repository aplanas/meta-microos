SUMMARY = "Performance Co-Pilot (PCP) per-socket metrics"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting per-socket statistics, making use of utilities such as 'ss'."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-sockets-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "ae1ec4dbbe349156b966468dc0dc76bde5dae98ec19966ef2f8745cf9d4605657330ebdf66bca508fd1806cd4b4931564e7b5cce3874575d217e91bebc185f0f"

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
