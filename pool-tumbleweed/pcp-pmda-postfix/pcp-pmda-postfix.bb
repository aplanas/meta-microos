SUMMARY = "Performance Co-Pilot (PCP) metrics for the Postfix (MTA)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Postfix (MTA)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-postfix-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "dd022d506d33e2aeb55cad936e8122293d4bb1f537d2a749510c18187d371644aea0bcaf51791c9e9fca084af7077effd1ed63fc5b216c0764ba61a21c6f5ce4"

RPROVIDES:${PN} += "pcp-pmda-postfix"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA \
postfix \
postfix-doc"

inherit rpm
