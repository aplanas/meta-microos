SUMMARY = "Performance Co-Pilot (PCP) metrics for Bonded network interfaces"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about bonded network interfaces."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bonding-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "8ef199fbc70d903244683bf93ae56c90cd3cd476f739c56d2e697bcaafac04c4d7c943fc893410e0775d25fae8cf6f12165213f7052bde16416f02369d6ed132"

RPROVIDES:${PN} += "pcp-pmda-bonding"

RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
