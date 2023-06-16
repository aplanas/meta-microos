SUMMARY = "Performance Co-Pilot (PCP) metrics for Rsyslog"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Rsyslog."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rsyslog-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "f02f9cfe8e2fb037bddcd394db064e65b601f375f86359981ec7ae11b4c056d1e02c973e99cba6f23fe077549b3075c8393ae14dfe71fb5157e30e617c283972"

RPROVIDES:${PN} += "pcp-pmda-rsyslog"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
