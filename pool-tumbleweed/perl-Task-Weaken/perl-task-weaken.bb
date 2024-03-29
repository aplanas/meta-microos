SUMMARY = "Ensure that a platform has weaken support"
DESCRIPTION = "One recurring problem in modules that use Scalar::Util's 'weaken' function \
is that it is not present in the pure-perl variant. \
 \
While this isn't necessarily always a problem in a straight CPAN-based Perl \
environment, some operating system distributions only include the pure-Perl \
versions, don't include the XS version, and so weaken is then 'missing' \
from the platform, *despite* passing a dependency on Scalar::Util \
successfully. \
 \
Most notably this is RedHat Linux at time of writing, but other come and go \
and do the same thing, hence 'recurring problem'. \
 \
The normal solution is to manually write tests in each distribution to \
ensure that 'weaken' is available. \
 \
This restores the functionality testing to a dependency you do once in your \
_Makefile.PL_, rather than something you have to write extra tests for each \
time you write a module. \
 \
It should also help make the package auto-generators for the various \
operating systems play more nicely, because it introduces a dependency that \
they *have* to have a proper weaken in order to work."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.06"

RPM_NAME = "perl-Task-Weaken-1.06-2.17.noarch.rpm"
RPM_HASH = "04e32cbdb5471a84148b31832d64fe6ed32ad98539adbb42c4c5b411060b1f9b2bbf039cb807dbbf206ca65176ab27fe486bd8ddda6ffe2ae3d8b2494bb1568b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Task--Weaken \
perl-Task-Weaken"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Scalar--Util"

inherit rpm
