SUMMARY = "Performance Co-Pilot (PCP) metrics for Database responsiveness"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Database response times and Availablility."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-dbping-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "8b05deec4c05cb964b1e85c5e3110b7c8975e2cdb620f035af641dfe914a6b00f69801af57727a9d32d6088334bec61f9042ad826f6b661b14837ee6a39e6068"

RPROVIDES:${PN} += "pcp-pmda-dbping"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
