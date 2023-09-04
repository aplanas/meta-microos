SUMMARY = "Performance Co-Pilot (PCP) metrics for Bonded network interfaces"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about bonded network interfaces."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bonding-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "a36dec4435670a257a6c313e28e505b16a9656592a457644c2a522763f8f009e88cafb4a710695aed40404f4ac823457a4b8ab4a20ad4bf7243ff9d73f25d36d"

RPROVIDES:${PN} += "pcp-pmda-bonding"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
