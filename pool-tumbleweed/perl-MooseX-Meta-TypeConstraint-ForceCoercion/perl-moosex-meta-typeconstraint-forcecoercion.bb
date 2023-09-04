SUMMARY = "Force coercion when validating type constraints"
DESCRIPTION = "This class allows to wrap any 'Moose::Meta::TypeConstraint' in a way that \
will force coercion of the value when checking or validating a value \
against it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-MooseX-Meta-TypeConstraint-ForceCoercion-0.01-9.26.noarch.rpm"
RPM_HASH = "4d24cc9858aff1a0bc4e1d79eb3359050f1e3f2e30257a67a59ba39a006f05dab933e33f1838a9964ce8b3f5bad3d74374c6a98ef3dd82d26784bab94ba44425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Meta--TypeConstraint--ForceCoercion \
perl-MooseX-Meta-TypeConstraint-ForceCoercion"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-namespace--autoclean"

inherit rpm
