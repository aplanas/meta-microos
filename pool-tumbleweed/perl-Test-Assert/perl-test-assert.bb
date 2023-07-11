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

RPM_NAME = "perl-Test-Assert-0.0504-9.25.noarch.rpm"
RPM_HASH = "62b6251b04d4418379bceddcb61b8b68bbb1ca9f556043a69ff0194dc1515194114da48a3c372093bd9aafda913b5bd23c9f705d31aa0a7113afab252b3318cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Exception--Assertion \
perl-Test--Assert \
perl-Test-Assert"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exception--Base \
perl-Symbol--Util \
perl-constant--boolean"

inherit rpm
