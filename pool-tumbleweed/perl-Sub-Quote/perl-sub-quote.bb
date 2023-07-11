SUMMARY = "Efficient generation of subroutines via string eval"
DESCRIPTION = "This package provides performant ways to generate subroutines from strings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.006008"

RPM_NAME = "perl-Sub-Quote-2.006008-1.2.noarch.rpm"
RPM_HASH = "d1b7a1e44239086f5254196110274219a5d0915127c92be82fb5dc69ef4c14bb0926857f171ba3ebf77818baab30b8716143b29b891b0c4d2b12f061acdcf6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Defer \
perl-Sub--Quote \
perl-Sub-Quote"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
