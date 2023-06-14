SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware sensors"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Linux hardware monitoring sensors."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lmsensors-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "655c4a135fd09933f3b0894f831ffa01078cf0b1fb51521b406805dd8ae8e310b60e7478114c41d910cd3ff984912701185ab8a8a4340bb298ce33d37b7aaf0d"

RPROVIDES:${PN} += "pcp-pmda-lmsensors"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
