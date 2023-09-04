SUMMARY = "Introspect overloaded operators"
DESCRIPTION = "Devel::OverloadInfo returns information about overloaded operators for a \
given class (or object), including where in the inheritance hierarchy the \
overloads are declared and where the code implementing them is."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-Devel-OverloadInfo-0.007-1.11.noarch.rpm"
RPM_HASH = "cbe1b3f509c2eacf6856e005d6fc6146b8f1071f8dc9c369255990ccb711fe7a3ad215fc6543f406f1836b037b1bfb5b27a49fa449a5d8e4972e0cd5a838021e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--OverloadInfo \
perl-Devel-OverloadInfo"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MRO--Compat \
perl-Package--Stash \
perl-Sub--Util"

inherit rpm
