SUMMARY = "Loads one of several alternate underlying implementations for a module"
DESCRIPTION = "This module abstracts out the process of choosing one of several underlying \
implementations for a module. This can be used to provide XS and pure Perl \
implementations of a module, or it could be used to load an implementation \
for a given OS or any other case of needing to provide multiple \
implementations. \
 \
This module is only useful when you know all the implementations ahead of \
time. If you want to load arbitrary implementations then you probably want \
something like a plugin system, not this module."
LICENSE = "Artistic-2.0"

PV = "0.09"

RPM_NAME = "perl-Module-Implementation-0.09-1.27.noarch.rpm"
RPM_HASH = "8285ff400fd4704260d1933c24969c050058de8daf8433cf3df0871987b46dace0dd9ed98be18cfcbcdb265ca2ab468efd4ff75204ed49054b17a28c9db51c58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Implementation \
perl-Module-Implementation"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Runtime \
perl-Try--Tiny"

inherit rpm
