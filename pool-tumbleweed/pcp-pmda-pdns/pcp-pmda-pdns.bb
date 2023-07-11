SUMMARY = "Performance Co-Pilot (PCP) metrics for PowerDNS"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the PowerDNS."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-pdns-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "4d431e70215f5bae509456c709f76268e42979371c06ed1754fbf4c3aba07db57fac24b38ba6c4f7edc8a96f57d81ba1460e7ffee01890ae835260a3ac11d662"

RPROVIDES:${PN} += "pcp-pmda-pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
