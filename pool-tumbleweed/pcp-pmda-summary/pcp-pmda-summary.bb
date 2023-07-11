SUMMARY = "Performance Co-Pilot (PCP) summary metrics from pmie"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about other installed pmdas."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-summary-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "5f3732930b51f69a8fa8fa040eca4becd5b419e0dd4b9e19bd2d6d8fa4f8a2105a0fcf56b45034d43faa66a52625881371136b1317013e968398c27206d93629"

RPROVIDES:${PN} += "config-pcp-pmda-summary \
pcp-pmda-summary"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
