SUMMARY = "SGML/XML Parsers"
DESCRIPTION = "SGMLSpm is a Perl script that reads ESIS output (from parsers like SP) \
and offers an event-based interface to the parser. As long as the \
parser can parse XML this also works for XML."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "perl-SGMLS-1.1-1.18.aarch64.rpm"
RPM_HASH = "de80e6cba64f8b99570f2a70b645914a78f0d9ffea8d295b7df5a842968a8c02a23d74f9a6b69e85000a3ae05f24d71e4032ed2aa89f80faaa17b01e243c0b28"

RPROVIDES:${PN} += "perl-SGMLS \
perl-SGMLS--Output \
perl-SGMLS--Refs \
perl-SGMLS-Attribute \
perl-SGMLS-Element \
perl-SGMLS-Entity \
perl-SGMLS-Event \
perl-SGMLS-Notation"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
