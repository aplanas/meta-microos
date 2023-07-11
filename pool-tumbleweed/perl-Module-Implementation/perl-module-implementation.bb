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

RPM_NAME = "perl-Module-Implementation-0.09-1.26.noarch.rpm"
RPM_HASH = "237740fa00d1bfa1ee9417f4912eaa7a3564bb7aa3cbb42ece148294873534af9722a773ba9fea5e59f9969bd0e74acfa5c32cf16adc8540ec4fa8275b695272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Implementation \
perl-Module-Implementation"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Runtime \
perl-Try--Tiny"

inherit rpm
