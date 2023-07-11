SUMMARY = "Performance Co-Pilot (PCP) metrics for Rsyslog"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Rsyslog."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rsyslog-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "bd42220aaa8e9ae8be90e1c4498ffdf8f747a17e6a807ec1f5939824562eea1e5adcf51569beed203a7301db5c8587686bf0d1f0c44d69ba6686601d44719ac6"

RPROVIDES:${PN} += "pcp-pmda-rsyslog"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
