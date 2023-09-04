SUMMARY = "Performance Co-Pilot (PCP) metrics for Rsyslog"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Rsyslog."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rsyslog-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "a4f7e7a7a6116797f1c5e1e07d3fbb28f2410ae655fd5a567ad35d7ad74183a8b853bac56e919fcdc808cd8912a97c175296ab64a01c620e1e45a0f2fb45edce"

RPROVIDES:${PN} += "pcp-pmda-rsyslog"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
