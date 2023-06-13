SUMMARY = "Basic Set Operations"
DESCRIPTION = "basic set operations"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.29"

RPM_NAME = "perl-Set-Scalar-1.29-1.27.noarch.rpm"
RPM_HASH = "396e4c95186ec36c6c579c68a227ba0b125f82baef8c90ebd5e9a548eb65cbba83f69974e985a6c0e7ec2c0efc6ccab455096f391f12c58d0c249b985e31cad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Set::Scalar) \
perl(Set::Scalar::Base) \
perl(Set::Scalar::Null) \
perl(Set::Scalar::Real) \
perl(Set::Scalar::Universe) \
perl(Set::Scalar::Valued) \
perl(Set::Scalar::ValuedUniverse) \
perl(Set::Scalar::Virtual) \
perl-Set-Scalar"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
