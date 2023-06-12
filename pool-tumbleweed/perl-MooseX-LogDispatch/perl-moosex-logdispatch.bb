SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.2002"

RPM_NAME = "perl-MooseX-LogDispatch-1.2002-10.19.noarch.rpm"
RPM_HASH = "8bec285d38ead1787e9963d2dd1979e256963da6cc1201fde4f3d9e2d10c32a843fca66753920874acb0de1cd51f147031dbd0114cc0c99f25c596a228c9177b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::LogDispatch) \
perl(MooseX::LogDispatch::Levels) \
perl-MooseX-LogDispatch"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Log::Dispatch::Configurator) \
perl(Moose)"

inherit rpm
