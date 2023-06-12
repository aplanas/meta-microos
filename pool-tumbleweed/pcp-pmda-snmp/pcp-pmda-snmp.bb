SUMMARY = "Performance Co-Pilot (PCP) metrics for Simple Network Management Protocol"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about SNMP."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-snmp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "7a7215a02367e24fca2cb6f60547a7137e80470a89344ed0c4f60513bb37440402a9a4c7248b733848c6b2a404408a56e7a31f33dd44d631102337f314fef876"

RPROVIDES:${PN} += "pcp-pmda-snmp \
pcp-pmda-snmp(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl(Net::SNMP) \
perl-PCP-PMDA"

inherit rpm
