SUMMARY = "Introspect overloaded operators"
DESCRIPTION = "Devel::OverloadInfo returns information about overloaded operators for a \
given class (or object), including where in the inheritance hierarchy the \
overloads are declared and where the code implementing them is."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-Devel-OverloadInfo-0.007-1.9.noarch.rpm"
RPM_HASH = "4a9ad4df34b57333f4bbc28d7119ca1cd0d02984affa1cd53fcfbe44ea96139131c3bd20642a5ef225f98fe9ffd7dd83f0f1f0140b4eb912c8480473a7b7933c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::OverloadInfo) \
perl-Devel-OverloadInfo"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(MRO::Compat) \
perl(Package::Stash) \
perl(Sub::Util)"

inherit rpm
