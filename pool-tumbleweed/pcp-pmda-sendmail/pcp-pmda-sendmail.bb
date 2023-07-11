SUMMARY = "Performance Co-Pilot (PCP) metrics for Sendmail"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Sendmail traffic."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-sendmail-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "972639fec839a42a58956dc55ccff7f4f4d601ea6ebd947b149caa222e6eebe68741033f4d524f7baa18264ac6e27101c1ed1e58494befcb0d75f434a9535dc8"

RPROVIDES:${PN} += "pcp-pmda-sendmail"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
