SUMMARY = "Error/exception handling in an OO-ish way"
DESCRIPTION = "The 'Error' package provides two interfaces. Firstly 'Error' provides a \
procedural interface to exception handling. Secondly 'Error' is a base \
class for errors/exceptions that can either be thrown, for subsequent \
catch, or can simply be recorded. \
 \
Errors in the class 'Error' should not be thrown directly, but the user \
should throw errors from a sub-class of 'Error'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17029"

RPM_NAME = "perl-Error-0.17029-1.15.noarch.rpm"
RPM_HASH = "7efa416da13d3434255b80e75eb1fc1676d994a29a761b3aef3696b7d16207a3917c7d19d422e5955b0900399fbf1b26bbdf0b325e19a447931cc9b6c586eea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Error \
perl-Error--Simple \
perl-Error--WarnDie \
perl-Error--subs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
