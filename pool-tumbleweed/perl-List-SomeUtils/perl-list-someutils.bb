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

RPM_NAME = "perl-List-SomeUtils-0.59-1.2.noarch.rpm"
RPM_HASH = "568a565122a80b721f4ea2c316f8a88e870486514aceba2af634d88f070c6d5a9050e23e3bfa552d7f2aab8c142937f9c33a123eedc07a8fd064df6749305260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(List::SomeUtils) \
perl(List::SomeUtils::PP) \
perl-List-SomeUtils"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(List::SomeUtils::XS) \
perl(Module::Implementation)"

inherit rpm
