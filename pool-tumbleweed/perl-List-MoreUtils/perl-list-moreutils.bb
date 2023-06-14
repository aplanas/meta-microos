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

RPM_NAME = "perl-List-MoreUtils-0.430-1.12.noarch.rpm"
RPM_HASH = "e559e1f0b0d3a136f710ed108cabd89e1e7fb9db523daac8312ad3fdd01544d48a0bba0aa9b462028eb27e9299bb0ec5db3c06eff075cf8d1ca6fc117d03f4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-List--MoreUtils \
perl-List--MoreUtils--PP \
perl-List-MoreUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Exporter--Tiny \
perl-List--MoreUtils--XS"

inherit rpm
