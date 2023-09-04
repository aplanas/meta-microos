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

RPM_NAME = "perl-Test-FailWarnings-0.008-3.28.noarch.rpm"
RPM_HASH = "6069bfd3050bb15ee3bbc4a3cc5b8bfcdd8a9ddd840be7a021f589e02bea713e773a4b649ac537160b654804e9b4f587a28efc4d55a6c6e7e24e438c2b22d045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--FailWarnings \
perl-Test-FailWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
