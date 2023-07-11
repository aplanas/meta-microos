SUMMARY = "Performance Co-Pilot (PCP) metrics for Samba"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Samba."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-samba-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "5b45f1a4aec76c24125c854f723e746c73ceddff16290c2cb79a9c904880c526ad6dca5f676528e8a04d1697ea2e76eda4744ea5b728d826c2fd2a46c32bce67"

RPROVIDES:${PN} += "pcp-pmda-samba"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
