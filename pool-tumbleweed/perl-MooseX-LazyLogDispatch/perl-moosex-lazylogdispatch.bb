SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-LazyLogDispatch-0.02-10.21.noarch.rpm"
RPM_HASH = "80d2a2f69aafc254d933a11e05865a2816a63f6548f777990a061603e634224f662b3b887b2a6477bcd788e52d2557aef7fcbed4bd4993fbccde03fdb3bc4570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LazyLogDispatch \
perl-MooseX--LazyLogDispatch--Levels \
perl-MooseX-LazyLogDispatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Log--Dispatch--Configurator \
perl-Moose"

inherit rpm
