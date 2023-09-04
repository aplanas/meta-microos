SUMMARY = "Performance Co-Pilot (PCP) metrics for BIND servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from BIND (Berkeley Internet Name Domain)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bind2-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "94e6ba66efc0e8068630b617e7689abd87a6ff37ecbed43d6eb6a6feb851aadf2beaaeba843ee777ac6a7ffcf0749563b3adae949821a588ff473de8f4f186de"

RPROVIDES:${PN} += "pcp-pmda-bind2"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-File--Slurp \
perl-LWP--UserAgent \
perl-PCP-PMDA \
perl-XML--LibXML"

inherit rpm
