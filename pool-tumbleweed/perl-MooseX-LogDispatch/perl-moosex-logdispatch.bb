SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.2002"

RPM_NAME = "perl-MooseX-LogDispatch-1.2002-10.20.noarch.rpm"
RPM_HASH = "2b3cc0c11292f03ed60833b823d42c4ef4331f88ade182c94091b8029d8d4a141486bd2c49c2f32b550e875e31fd054e9eaa4520236baa2685eb84b8317c3522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LogDispatch \
perl-MooseX--LogDispatch--Levels \
perl-MooseX-LogDispatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Log--Dispatch--Configurator \
perl-Moose"

inherit rpm
