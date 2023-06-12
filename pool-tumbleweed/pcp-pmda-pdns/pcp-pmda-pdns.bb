SUMMARY = "Performance Co-Pilot (PCP) metrics for PowerDNS"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the PowerDNS."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-pdns-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "864d52c5e63b6b574d64650ae19d65615d29eef00eea99e9dcb49bd249dd3d99fc412f7a3b9aa421f56b004f54fcd4748b709279b34192782e0cb0f0f3f36a0a"

RPROVIDES:${PN} += "pcp-pmda-pdns \
pcp-pmda-pdns(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
