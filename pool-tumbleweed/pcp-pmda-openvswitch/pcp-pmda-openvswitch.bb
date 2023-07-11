SUMMARY = "Performance Co-Pilot (PCP) metrics for Open vSwitch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Open vSwitch."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-openvswitch-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "0f288681f551c9bb9aa7a4be8b3bb816212286eb58bb2be71199d0a4090af515fa865038e19ad3960809c104e77613faf5528a91370e8faa000a185bc5136418"

RPROVIDES:${PN} += "pcp-pmda-openvswitch"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
