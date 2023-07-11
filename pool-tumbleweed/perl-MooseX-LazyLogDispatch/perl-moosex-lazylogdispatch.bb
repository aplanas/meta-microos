SUMMARY = "Logging Role for Moose"
DESCRIPTION = "Log::Dispatch role for use with your Moose classes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-LazyLogDispatch-0.02-10.20.noarch.rpm"
RPM_HASH = "53da2a2ddc71891b207b07a646c0642aebc83764b0dfaaed7225e1e4642ab5fa94322755ac4daa2e8822cab33cfeacebf070e5ef0cb36fe670f8c6a38ad3001c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--LazyLogDispatch \
perl-MooseX--LazyLogDispatch--Levels \
perl-MooseX-LazyLogDispatch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Log--Dispatch--Configurator \
perl-Moose"

inherit rpm
