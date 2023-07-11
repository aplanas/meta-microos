SUMMARY = "Handy utf8 tests"
DESCRIPTION = "This module is a collection of tests useful for dealing with utf8 strings \
in Perl. \
 \
This module has two types of tests: The validity tests check if a string is \
valid and not corrupt, whereas the characteristics tests will check that \
string has a given set of characteristics."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Test-utf8-1.02-1.14.noarch.rpm"
RPM_HASH = "2388923be8b9aaca375b8539cb4cc91a22a83e46e72d1473f1a0fab77d13b754a2f6196ca213dd13d69eeb620fb811bca79804ebfbf191cab58598e86f9093e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--utf8 \
perl-Test-utf8"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
