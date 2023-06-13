SUMMARY = "Compare elements of two or more lists"
DESCRIPTION = "Compare elements of two or more lists"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.55"

RPM_NAME = "perl-List-Compare-0.55-1.12.noarch.rpm"
RPM_HASH = "0453901a0a30021b9dd928a218ba0166f9a5b113eb78d2f2d6bf9b5047c8ff81fcabab32f8c3aa8626a1f619f1b5bca3582fb6a309886916a7c938d72d6335ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(List::Compare) \
perl(List::Compare::Accelerated) \
perl(List::Compare::Base::_Auxiliary) \
perl(List::Compare::Base::_Engine) \
perl(List::Compare::Functional) \
perl(List::Compare::Multiple) \
perl(List::Compare::Multiple::Accelerated) \
perl-List-Compare"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
