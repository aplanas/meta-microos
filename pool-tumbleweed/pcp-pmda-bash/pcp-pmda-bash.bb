SUMMARY = "Performance Co-Pilot (PCP) metrics for the Bash shell"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Bash shell."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bash-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "96fee39b36803408ab86efe1bd8c4931596130b6a807c664cff56f5bf7550e38c76e9857c8584a5cb7b760aea3618d0248cbe8368c6340d77c685b94b34d7bbb"

RPROVIDES:${PN} += "pcp-pmda-bash"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
