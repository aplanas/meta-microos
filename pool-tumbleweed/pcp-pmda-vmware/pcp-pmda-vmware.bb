SUMMARY = "Performance Co-Pilot (PCP) metrics for VMware"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics for VMware."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-vmware-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "3275b6c8729d3a2967dea69f010a473ac58705f826bd7c81d483ebfb208a3c29b85bf411cc9eb7a0585bd255ea88c977caf87f7655b24e2a8131b393418f9b20"

RPROVIDES:${PN} += "pcp-pmda-vmware"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
