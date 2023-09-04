SUMMARY = "SGML/XML Parsers"
DESCRIPTION = "SGMLSpm is a Perl script that reads ESIS output (from parsers like SP) \
and offers an event-based interface to the parser. As long as the \
parser can parse XML this also works for XML."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "perl-SGMLS-1.1-1.19.aarch64.rpm"
RPM_HASH = "3517947b4009cc9b57368d3835ff542c1bc73a7ca8abb4208ec7d171a279b4bd54c9182bc0d5257c6c6792ad969fed77ad2ef6692cf6e85f1d89ff3cb89a3ea8"

RPROVIDES:${PN} += "perl-SGMLS \
perl-SGMLS--Output \
perl-SGMLS--Refs \
perl-SGMLS-Attribute \
perl-SGMLS-Element \
perl-SGMLS-Entity \
perl-SGMLS-Event \
perl-SGMLS-Notation"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
