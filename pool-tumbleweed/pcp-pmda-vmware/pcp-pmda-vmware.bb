SUMMARY = "Performance Co-Pilot (PCP) metrics for VMware"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics for VMware."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-vmware-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "b1c9327d0257143ebdc9b2b12010f60fcc6969265bc5bd24c8dbec7fc3d5dd34d5f5cbf9c8365b831aaef7384d1cbbaf355d9da4cadcd217a3a78ec27e65dc74"

RPROVIDES:${PN} += "pcp-pmda-vmware"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
