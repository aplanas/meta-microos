SUMMARY = "Required attributes which fail only when trying to use them"
DESCRIPTION = "This module adds a 'lazy_required' option to Moose attribute declarations. \
 \
The reader methods for all attributes with that option will throw an \
exception unless a value for the attributes was provided earlier by a \
constructor parameter or through a writer method."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-LazyRequire-0.11-1.26.noarch.rpm"
RPM_HASH = "4236d2dfacb30d23d8cc33abc970198340b780f510dcbc7192dc261cbced7da162fef646c855a43b8f4c37d5aa0a5b041f5f87067df157d5ff3678d81d2234a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LazyRequire \
perl-MooseX--LazyRequire--Meta--Attribute--Trait--LazyRequire \
perl-MooseX-LazyRequire"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Moose--Exporter \
perl-Moose--Role \
perl-aliased \
perl-namespace--autoclean"

inherit rpm
