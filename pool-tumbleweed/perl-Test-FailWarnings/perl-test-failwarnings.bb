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

RPM_NAME = "perl-Test-FailWarnings-0.008-3.26.noarch.rpm"
RPM_HASH = "00fa3b470fc030bb82bc3888a059fac41c11cbe623bf373bc5ea7dccd84d20d64aa9e14853c3c533d78b9362e3076490b1841d143035de51a47ea9f1147fbb3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--FailWarnings \
perl-Test-FailWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Test--More"

inherit rpm
