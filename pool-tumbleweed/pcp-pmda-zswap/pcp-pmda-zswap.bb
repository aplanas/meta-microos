SUMMARY = "Performance Co-Pilot (PCP) metrics for compressed swap"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about compressed swap."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-zswap-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "3efb653aa6fd1a49c8e10da29b8361654144c1c8aba58071c9de6074cec1a0d1fcc9f9dd29c2335a0db10898a24dbc3c2d585da456afc5f54b954bc7b66c645e"

RPROVIDES:${PN} += "pcp-pmda-zswap"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
