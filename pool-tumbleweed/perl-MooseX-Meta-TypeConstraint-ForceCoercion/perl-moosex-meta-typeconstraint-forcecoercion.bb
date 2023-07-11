SUMMARY = "Force coercion when validating type constraints"
DESCRIPTION = "This class allows to wrap any 'Moose::Meta::TypeConstraint' in a way that \
will force coercion of the value when checking or validating a value \
against it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-MooseX-Meta-TypeConstraint-ForceCoercion-0.01-9.25.noarch.rpm"
RPM_HASH = "34d9cd967b820832abfc7490f11261ae46a1ad4589aa4b264b51c576cd6070a85124e87af3e8c4494e10785bdb991124570adb1639b1d92184c33fa5cf4067eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Meta--TypeConstraint--ForceCoercion \
perl-MooseX-Meta-TypeConstraint-ForceCoercion"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-namespace--autoclean"

inherit rpm
