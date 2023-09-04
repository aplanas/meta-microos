SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics for NFS Clients."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nfsclient-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "80277514bdbf2c0052abb9accd6981a97829f69a719c89550b378c434ebafecdd4c3909566a2651a3c8f0c5beeb64f855459eb6ce838e5d454df7d835c5e9309"

RPROVIDES:${PN} += "pcp-pmda-nfsclient"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
