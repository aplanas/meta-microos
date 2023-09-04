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

RPM_NAME = "perl-List-SomeUtils-0.59-1.4.noarch.rpm"
RPM_HASH = "4e5fe63f2d6f8e35df4ded2b6e702552c7536f872f20768ad9a06c78945a0cad9d87a9db39ada982e8368034b491b4eca178cf2cf23620357e3bb95d87cbae95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--SomeUtils \
perl-List--SomeUtils--PP \
perl-List-SomeUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-List--SomeUtils--XS \
perl-Module--Implementation"

inherit rpm
