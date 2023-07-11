SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nvidia GPU"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Nvidia GPUs."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nvidia-gpu-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "f36905329294487010790b987aa2d1ec729b252902313d7da5e1669bc5923985106e9387564e6964c8a87eb7fa8595d45b6d0004eb42c71881fb4db3105189df"

RPROVIDES:${PN} += "pcp-pmda-nvidia-gpu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
