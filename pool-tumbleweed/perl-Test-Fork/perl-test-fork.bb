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

RPM_NAME = "perl-Test-Fork-0.02-1.7.noarch.rpm"
RPM_HASH = "5780cafc69a03b539bcce9fe7ebf4bae400a6967aa096baa88bc1da5c04ba801847de73bbe8db495aad2764f7185c61b73cfad7cab3a06e193773c55c0d228e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Fork \
perl-Test-Fork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
