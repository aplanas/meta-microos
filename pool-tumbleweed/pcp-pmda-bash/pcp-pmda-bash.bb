SUMMARY = "Performance Co-Pilot (PCP) metrics for the Bash shell"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Bash shell."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bash-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "446a581497dfe47c69bde80709c61447cdc002f7157589b7a0aa07892e150576a3c0e8153a3cdffc600fbb7c8015b1661ae8d17e44b1e30463300a70a2ea3d6e"

RPROVIDES:${PN} += "pcp-pmda-bash"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
