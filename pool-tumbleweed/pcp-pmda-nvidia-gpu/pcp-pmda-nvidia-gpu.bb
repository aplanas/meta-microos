SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nvidia GPU"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Nvidia GPUs."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nvidia-gpu-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "1ba303bd255135b76b05e0ce6c0d4c5ff5d1a295d1d3f8b841372c05dd73724263d0cabac8af0dec6f1ec5c90474636e2a1e0244122af0733c1755050de02aae"

RPROVIDES:${PN} += "pcp-pmda-nvidia-gpu \
pcp-pmda-nvidia-gpu(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpcp.so.3()(64bit) \
libpcp_pmda.so.3()(64bit)"

inherit rpm
