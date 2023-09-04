SUMMARY = "Assertion methods for those who like JUnit."
DESCRIPTION = "This class provides a set of assertion methods useful for writing tests. \
The API is based on JUnit4 and the Test::Unit::Lite manpage and the methods \
die on failure. \
 \
These assertion methods might be not useful for common the Test::Builder \
manpage-based (the Test::Simple manpage, the Test::More manpage, etc.) test \
units. \
 \
The assertion methods can be used in class which is derived from \
'Test::Assert' or used as standard Perl functions after importing them into \
user's namespace. \
 \
'Test::Assert' can also wrap standard the Test::Simple manpage, the \
Test::More manpage or other the Test::Builder manpage-based tests. \
 \
The assertions can be also used for run-time checking."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0504"

RPM_NAME = "perl-Test-Assert-0.0504-9.26.noarch.rpm"
RPM_HASH = "28cbbb8fd136b608c9d123c827b0970c87cb09d58fc01137637d15f37f36faf9f24b185f5da553df2ad8d5946a5d017019492eb050c5ccb50a7e823ced1440ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Assertion \
perl-Test--Assert \
perl-Test-Assert"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exception--Base \
perl-Symbol--Util \
perl-constant--boolean"

inherit rpm
