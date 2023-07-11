SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Server Loggers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a 389 Directory Server log."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-ds389log-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "76d837ec9c9036a972c3bd19184657c64c86accc38dd70bb0816fc4f6196d304e5e8c03545e3c8ac6b0b8e25088ec62c7af3dd21980f6efaea956057326e461c"

RPROVIDES:${PN} += "pcp-pmda-ds389log"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-Date-Manip \
perl-PCP-PMDA"

inherit rpm
