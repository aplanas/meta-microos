SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.2002"

RPM_NAME = "perl-MooseX-LogDispatch-1.2002-10.21.noarch.rpm"
RPM_HASH = "4137842cd6d1b47cfc58406103a35638a9f4cb04959f6410ff6c10e192cc78678defbfd3bf94e27bc01d6fb46e22c7c763f65c649f976ba42249b34e37d68068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LogDispatch \
perl-MooseX--LogDispatch--Levels \
perl-MooseX-LogDispatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Log--Dispatch--Configurator \
perl-Moose"

inherit rpm
