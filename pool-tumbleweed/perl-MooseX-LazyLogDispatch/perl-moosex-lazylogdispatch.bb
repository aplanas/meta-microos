SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-LazyLogDispatch-0.02-10.19.noarch.rpm"
RPM_HASH = "b63ea128c21cb195a99e497e9e97331ad21c1df076ce139ec2104969f60c65d63a7b5637106c22f1c2aaa826ea0a6316ed09195238d0a4419379b98aae6fd1f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::LazyLogDispatch) \
perl(MooseX::LazyLogDispatch::Levels) \
perl-MooseX-LazyLogDispatch"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Log::Dispatch::Configurator) \
perl(Moose)"

inherit rpm
