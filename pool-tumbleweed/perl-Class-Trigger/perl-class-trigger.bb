SUMMARY = "Mixin to add / call inheritable triggers"
DESCRIPTION = "Class::Trigger is a mixin class to add / call triggers (or hooks) that get \
called at some points you specify."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Class-Trigger-0.15-1.15.noarch.rpm"
RPM_HASH = "c1d90b028c722af0dea74b2a8d5b297df8ff37bef9d9f2d1a6a6a114cbe33e05029b61a497543aa8d54daee7e8ecb91857a4ef644292e32c2709069ad09eca98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Trigger \
perl-Class-Trigger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
