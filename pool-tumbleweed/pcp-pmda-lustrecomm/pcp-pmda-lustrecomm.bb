SUMMARY = "Performance Co-Pilot (PCP) metrics for the Lustre Filesytem Comms"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Lustre Filesystem Comms."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lustrecomm-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "8287e8584162364fb26ece390717b3c8946e0aacd13dfba5fc274b65cb944d4329192ff44e27252286508c5e11e4b3651595fbe169c38615e847ff89d6fca27b"

RPROVIDES:${PN} += "pcp-pmda-lustrecomm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
