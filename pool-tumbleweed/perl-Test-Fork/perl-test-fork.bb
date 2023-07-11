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

RPM_NAME = "perl-Test-Fork-0.02-1.8.noarch.rpm"
RPM_HASH = "594124466e45d780f0571da686379d7aa9ce28acc7fb7f1f90c919d854174df6e6c6f6ac299d89a2fac2d506ed0b4e7e2ff6892b1291d213163edd912bb2f26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Fork \
perl-Test-Fork"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
