SUMMARY = "Provide the stuff missing in List::Util"
DESCRIPTION = "*List::MoreUtils* provides some trivial but commonly needed functionality \
on lists which is not going to go into List::Util. \
 \
All of the below functions are implementable in only a couple of lines of \
Perl code. Using the functions from this module however should give \
slightly better performance as everything is implemented in C. The \
pure-Perl implementation of these functions only serves as a fallback in \
case the C portions of this module couldn't be compiled on this machine."
LICENSE = "Apache-2.0"

PV = "0.430"

RPM_NAME = "perl-List-MoreUtils-0.430-1.14.noarch.rpm"
RPM_HASH = "d8d62344538187e4dfae858bde88406fff0ce5f6d7e973ff5f9d553543da1cbe8778a76220121575adb7b68c51e45fd7ba9e6fb28a35b04a15b60c797cf3209a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--MoreUtils \
perl-List--MoreUtils--PP \
perl-List-MoreUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter--Tiny \
perl-List--MoreUtils--XS"

inherit rpm
