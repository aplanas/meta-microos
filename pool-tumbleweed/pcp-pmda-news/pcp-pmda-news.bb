SUMMARY = "Performance Co-Pilot (PCP) metrics for Usenet News"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Usenet News."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-news-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "59e6988ad1e178dc33fad502a86de4155c88aab6938b6f4c0a3cf603780b10d363020e69947d80a983fe8998ac2bff52adeabe48069ae820ff7621df660416dc"

RPROVIDES:${PN} += "pcp-pmda-news"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
