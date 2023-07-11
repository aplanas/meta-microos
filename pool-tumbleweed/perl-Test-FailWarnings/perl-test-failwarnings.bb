SUMMARY = "Add test failures if warnings are caught"
DESCRIPTION = "This module hooks '$SIG{__WARN__}' and converts warnings to the Test::More \
manpage 'fail()' calls. It is designed to be used with 'done_testing', when \
you don't need to know the test count in advance. \
 \
Just as with the Test::NoWarnings manpage, this does not catch warnings if \
other things localize '$SIG{__WARN__}', as this is designed to catch \
_unhandled_ warnings."
LICENSE = "Apache-2.0"

PV = "0.008"

RPM_NAME = "perl-Test-FailWarnings-0.008-3.27.noarch.rpm"
RPM_HASH = "5eae3614551c3c2239839e31ee4c5934b12814377ced440488f29ef904fa7606cc302aa3237674fb53c48f58b657fa0a62c85129a186b40ae437995341cabf13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--FailWarnings \
perl-Test-FailWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
