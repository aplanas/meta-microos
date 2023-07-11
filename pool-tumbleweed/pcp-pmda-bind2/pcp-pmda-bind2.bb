SUMMARY = "Performance Co-Pilot (PCP) metrics for BIND servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from BIND (Berkeley Internet Name Domain)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-bind2-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "dc13158bf3c7594fb8118f81730dc8a9f05f7fd71b6b12e6240d23f310bfb5f5dc57012d10fc5889423801cad1a01eaf8e099934f0f317acd5e077ba596f4fda"

RPROVIDES:${PN} += "pcp-pmda-bind2"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-File--Slurp \
perl-LWP--UserAgent \
perl-PCP-PMDA \
perl-XML--LibXML"

inherit rpm
