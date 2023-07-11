SUMMARY = "Performance Co-Pilot (PCP) metrics for the Bash shell"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Bash shell."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bash-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "f09aa16dd6a59441d500be35c8a57c3a356d110788f9c7b2c52ca2407257218f030e530eeeea9504e59f9283fedb6105e6e122a2878833343ad7a4e0eb466168"

RPROVIDES:${PN} += "pcp-pmda-bash"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
