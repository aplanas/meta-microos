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

RPM_NAME = "perl-Test-SubCalls-1.10-1.20.noarch.rpm"
RPM_HASH = "6c423c9d8180b05bb972010890f966704384b95c7716f6719ccb33efe1b405b0f4ae5ad0d1be814ab281b7f1beb93ff90d09076bc80ea0aadcad185a6ed86c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--SubCalls \
perl-Test-SubCalls"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Hook--LexWrap"

inherit rpm
