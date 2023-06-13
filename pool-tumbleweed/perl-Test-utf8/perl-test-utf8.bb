SUMMARY = "Handy utf8 tests"
DESCRIPTION = "This module is a collection of tests useful for dealing with utf8 strings \
in Perl. \
 \
This module has two types of tests: The validity tests check if a string is \
valid and not corrupt, whereas the characteristics tests will check that \
string has a given set of characteristics."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Test-utf8-1.02-1.13.noarch.rpm"
RPM_HASH = "8c2134c2e5b73c8cb1dac02731a9f977cb95f59569fe4e618b64d109b1d7dff61777664705e46620f97e97c8186386c142dab395205b9ce95dba17843d750a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::utf8) \
perl-Test-utf8"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
