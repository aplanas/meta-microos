SUMMARY = "Performance Co-Pilot (PCP) metrics for Database responsiveness"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Database response times and Availablility."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-dbping-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "623b3a656419bc44713adf34cf1d8a30e90d9a2bce7505153cb7e789ecd19919a40195a18e7f5f29d15f1c341552e43ea492eeaae41b4e6a4e5ff440e3c03fbd"

RPROVIDES:${PN} += "pcp-pmda-dbping"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
