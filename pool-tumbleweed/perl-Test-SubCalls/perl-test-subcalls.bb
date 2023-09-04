SUMMARY = "Track the number of times subs are called"
DESCRIPTION = "There are a number of different situations (like testing caching code) \
where you want to want to do a number of tests, and then verify that some \
underlying subroutine deep within the code was called a specific number of \
times. \
 \
This module provides a number of functions for doing testing in this way in \
association with your normal Test::More (or similar) test scripts."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.10"

RPM_NAME = "perl-Test-SubCalls-1.10-1.21.noarch.rpm"
RPM_HASH = "815d165cba299238deec683d2d7adc2205e2de22b943c5614006e4187a66b1b69dc780e65c824bbf1256af9ffc5c7b21a282b68e27cfda2104a4ec8c1374e687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--SubCalls \
perl-Test-SubCalls"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Hook--LexWrap"

inherit rpm
