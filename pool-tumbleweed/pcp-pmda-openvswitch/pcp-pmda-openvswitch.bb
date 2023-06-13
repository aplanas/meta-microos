SUMMARY = "Performance Co-Pilot (PCP) metrics for Open vSwitch"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Open vSwitch."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-openvswitch-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "246cc790e541b239bb3718bbcb549130dadccc02f0c3ee87893462cc6083b3af92b397916694c134ef633efb7a15926f64b0d5018b7bade035cc63242b3cd62f"

RPROVIDES:${PN} += "pcp-pmda-openvswitch \
pcp-pmda-openvswitch(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
