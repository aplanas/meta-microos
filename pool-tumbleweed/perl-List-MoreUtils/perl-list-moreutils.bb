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

RPM_NAME = "perl-List-MoreUtils-0.430-1.13.noarch.rpm"
RPM_HASH = "c6248d56a53a1c322ef3157abea8b8d1114b8261c44d840f8807706d2a48f28c3f29faa46e62d611c059d84b8fc69c981ecc783683340a20a5946a2b576dcd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--MoreUtils \
perl-List--MoreUtils--PP \
perl-List-MoreUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exporter--Tiny \
perl-List--MoreUtils--XS"

inherit rpm
