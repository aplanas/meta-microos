SUMMARY = "Handy utf8 tests"
DESCRIPTION = "This module is a collection of tests useful for dealing with utf8 strings \
in Perl. \
 \
This module has two types of tests: The validity tests check if a string is \
valid and not corrupt, whereas the characteristics tests will check that \
string has a given set of characteristics."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Test-utf8-1.02-1.15.noarch.rpm"
RPM_HASH = "d15cf169d7b10ea90ae41a15c95546ded8738f21524c6ec52b0fbe0692531cf38268d1b7b9dd24f14b7b8aa8bcdf161f065a66fbc28fc736efb4ef754b4a0445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--utf8 \
perl-Test-utf8"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
