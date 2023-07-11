SUMMARY = "Provides basic first-pass API testing for large class trees"
DESCRIPTION = "For many APIs with large numbers of classes, it can be very useful to be \
able to do a quick once-over to make sure that classes, methods, and \
inheritance is correct, before doing more comprehensive testing. This \
module aims to provide such a capability."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Test-ClassAPI-1.07-1.20.noarch.rpm"
RPM_HASH = "ef854cd77c52ce838888c51b87cd5356e367e9e9e1cd3acadbf8af6a84a72600465a1b6c813dfd62e819c37627ae665656bdaf5685779edfd2cc13725b0bb43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--ClassAPI \
perl-Test-ClassAPI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Inspector \
perl-Config--Tiny \
perl-Params--Util"

inherit rpm
