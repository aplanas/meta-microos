SUMMARY = "Required attributes which fail only when trying to use them"
DESCRIPTION = "This module adds a 'lazy_required' option to Moose attribute declarations. \
 \
The reader methods for all attributes with that option will throw an \
exception unless a value for the attributes was provided earlier by a \
constructor parameter or through a writer method."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-LazyRequire-0.11-1.27.noarch.rpm"
RPM_HASH = "b1fadd09efd87876c218c4c1b16f7966f00620872d9932bdf61fdfacb43271325e3d06621f906355f37d9b4dbac3dd69da4bd64291c42c7aaa7e7397d951d87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LazyRequire \
perl-MooseX--LazyRequire--Meta--Attribute--Trait--LazyRequire \
perl-MooseX-LazyRequire"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-aliased \
perl-namespace--autoclean"

inherit rpm
