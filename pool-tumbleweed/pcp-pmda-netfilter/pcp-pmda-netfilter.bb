SUMMARY = "Performance Co-Pilot (PCP) metrics for Netfilter framework"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Netfilter packet filtering framework."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-netfilter-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "78b030d3e7afbe615719e0ebfe7932e012a966630efbf8fa77fcfa351dde6c5d42b9708cd9b093ae661ece5344e5929bfca498549064829c022b6a0d447a6d2b"

RPROVIDES:${PN} += "pcp-pmda-netfilter"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
