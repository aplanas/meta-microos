SUMMARY = "Introspect overloaded operators"
DESCRIPTION = "Devel::OverloadInfo returns information about overloaded operators for a \
given class (or object), including where in the inheritance hierarchy the \
overloads are declared and where the code implementing them is."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-Devel-OverloadInfo-0.007-1.10.noarch.rpm"
RPM_HASH = "9cff0376ef58541d6d898496b131b6c1c7f322c8b69e8ada20aa488deccce9a7bbe04f3af6edde932b9199e9889fcb8f08e02847c28f091d62761391ca35e61a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--OverloadInfo \
perl-Devel-OverloadInfo"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MRO--Compat \
perl-Package--Stash \
perl-Sub--Util"

inherit rpm
