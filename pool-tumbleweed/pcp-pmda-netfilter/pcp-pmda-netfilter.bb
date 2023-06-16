SUMMARY = "Performance Co-Pilot (PCP) metrics for Netfilter framework"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Netfilter packet filtering framework."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-netfilter-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "7628714cf9867a3d1b58d6a99d516c68300afad085fdd240dfe1cd1162e8ea30ee7e7b867ae325a6055c4e02c2137c1c5915af61671f38f177ee08a1038de326"

RPROVIDES:${PN} += "pcp-pmda-netfilter"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
