SUMMARY = "Performance Co-Pilot (PCP) metrics for the Nvidia GPU"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Nvidia GPUs."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nvidia-gpu-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "817425babf93287a2b61708a7396b0ff4d046fdc5c64aa0aabc6937aff86bdd55489cb5fc3679e46b820f3936761263b47ebe0fa3b611ef903d6673debe3185e"

RPROVIDES:${PN} += "pcp-pmda-nvidia-gpu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
