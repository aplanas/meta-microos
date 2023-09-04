SUMMARY = "Performance Co-Pilot (PCP) metrics for Zimbra"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Zimbra."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-zimbra-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "fa0396586c3e003724700c243b32cbb7d7a1e37ad12c0a4e0f4b836f08b0f0b25a8a264850c223a71d027c2e1a64895d13c0fbc486c37b6bf06786c748f2a74d"

RPROVIDES:${PN} += "pcp-pmda-zimbra"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
