SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics for NFS Clients."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nfsclient-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "6ef1ca609bc25c5f1a5c6ed15214d8872e156ebe83b6a1c62813af540a68bf2a80b9fbf44f480830b2c529d4d739dee9d3d94458fa9df9b4f4210327faec8e59"

RPROVIDES:${PN} += "pcp-pmda-nfsclient"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
