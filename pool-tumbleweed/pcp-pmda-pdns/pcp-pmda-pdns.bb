SUMMARY = "Performance Co-Pilot (PCP) metrics for PowerDNS"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the PowerDNS."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-pdns-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "d3c1dbbb07f1faebba06d4750a583dd5e15ba16ff89be3106ae4cd506cf262080cffc25f1ef0e8d39dd61a96b8830662b2eb0708ccf8aebeac20751a9b773d3e"

RPROVIDES:${PN} += "pcp-pmda-pdns"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
