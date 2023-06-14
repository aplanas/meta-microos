SUMMARY = "Force coercion when validating type constraints"
DESCRIPTION = "This class allows to wrap any 'Moose::Meta::TypeConstraint' in a way that \
will force coercion of the value when checking or validating a value \
against it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01"

RPM_NAME = "perl-MooseX-Meta-TypeConstraint-ForceCoercion-0.01-9.24.noarch.rpm"
RPM_HASH = "48d9b8e19b567243b07691463e743bbb66f449932fc38ff98dfbf9f8950ae7e118605f81fc0e247dbaad1a2c1b1689f28c1644ee0c29e31c13c34ae2984b51cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Meta--TypeConstraint--ForceCoercion \
perl-MooseX-Meta-TypeConstraint-ForceCoercion"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Moose \
perl-namespace--autoclean"

inherit rpm
