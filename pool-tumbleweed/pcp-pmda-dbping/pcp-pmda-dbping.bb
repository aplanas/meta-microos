SUMMARY = "Performance Co-Pilot (PCP) metrics for Database responsiveness"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Database response times and Availablility."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-dbping-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "5462fba844fa653dc69c3885c89b844422e08a63f061af2f8fb0153e73f58da84019417284dff552229ef5df09368c7be4c2cc42bf9e38e549511cb5bd52f7b5"

RPROVIDES:${PN} += "pcp-pmda-dbping"

RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
