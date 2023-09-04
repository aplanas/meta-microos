SUMMARY = "Performance Co-Pilot (PCP) metrics for Open vSwitch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Open vSwitch."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-openvswitch-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "c0695f686c848d0775a9206666ae2412c036ab8621fb209fa3c23cc7d37bcf519f69f01e800c927163122ea0f540299da19d423e92b623fc67bd2873dea33090"

RPROVIDES:${PN} += "pcp-pmda-openvswitch"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
