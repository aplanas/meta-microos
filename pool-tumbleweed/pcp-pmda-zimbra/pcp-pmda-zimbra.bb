SUMMARY = "Performance Co-Pilot (PCP) metrics for Zimbra"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Zimbra."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-zimbra-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "acd8fbaf9f10b4c8a879933f42ef5aa8217e35a48e4286e639923623d3dcae13afed483c9944ff9b37fbe73c4ddf483ee0815da8177305fc55d05996bb0e8ea3"

RPROVIDES:${PN} += "pcp-pmda-zimbra"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
