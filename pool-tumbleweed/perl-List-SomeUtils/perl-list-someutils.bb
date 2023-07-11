SUMMARY = "Provide the stuff missing in List::Util"
DESCRIPTION = "*List::SomeUtils* provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util. \
 \
All of the below functions are implementable in only a couple of lines of \
Perl code. Using the functions from this module however should give \
slightly better performance as everything is implemented in C. The \
pure-Perl implementation of these functions only serves as a fallback in \
case the C portions of this module couldn't be compiled on this machine."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.59"

RPM_NAME = "perl-List-SomeUtils-0.59-1.3.noarch.rpm"
RPM_HASH = "6e907079562707ad5b224ca541222cd123158097d2d563ccae59935a1a09c4a703377d97de15e3ffa492890743c279ab3cf33ba636d8eb6356a32871271bf1a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--SomeUtils \
perl-List--SomeUtils--PP \
perl-List-SomeUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--SomeUtils--XS \
perl-Module--Implementation"

inherit rpm
