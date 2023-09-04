SUMMARY = "Test code which forks"
DESCRIPTION = "*THIS IS ALPHA CODE!* The implementation is unreliable and the interface is \
subject to change. \
 \
Because each test has a number associated with it, testing code which forks \
is problematic. Coordinating the test number amongst the parent and child \
processes is complicated. Test::Fork provides a function to smooth over the \
complications."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-Test-Fork-0.02-1.9.noarch.rpm"
RPM_HASH = "d11c72f199e18fd4570fdd1ee3f607f42289967d541bb2845db422319d4ed603ad74d16bfeb9cc165a4b5adf2a339e464e8d1f5efb2957c9b572bc3b113868aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Fork \
perl-Test-Fork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
