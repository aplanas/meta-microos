SUMMARY = "Performance Co-Pilot (PCP) metrics for BIND servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from BIND (Berkeley Internet Name Domain)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bind2-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "0ddac6f769a2a03a8204ecb9c5a1f59398e98d22a839429b27d1b985add677a0f88b02c9f66f86abc66de56353b025757301c671a7f43dd650a535df647560fe"

RPROVIDES:${PN} += "pcp-pmda-bind2 \
pcp-pmda-bind2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
perl(File::Slurp) \
perl(LWP::UserAgent) \
perl(XML::LibXML) \
perl-PCP-PMDA"

inherit rpm
