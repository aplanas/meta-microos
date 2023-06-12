SUMMARY = "Required attributes which fail only when trying to use them"
DESCRIPTION = "This module adds a 'lazy_required' option to Moose attribute declarations. \
 \
The reader methods for all attributes with that option will throw an \
exception unless a value for the attributes was provided earlier by a \
constructor parameter or through a writer method."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.11"

RPM_NAME = "perl-MooseX-LazyRequire-0.11-1.25.noarch.rpm"
RPM_HASH = "5910fda7f40192a92a885d3e38d68e3a114effb1aa9154e91cfa9b337ad2e1e110fbd90e8de4ac3935e5d127d9ff8eded56d6a899aefc2fb3c30a0b660b6139f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::LazyRequire) \
perl(MooseX::LazyRequire::Meta::Attribute::Trait::LazyRequire) \
perl-MooseX-LazyRequire"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Moose::Exporter) \
perl(Moose::Role) \
perl(aliased) \
perl(namespace::autoclean)"

inherit rpm
