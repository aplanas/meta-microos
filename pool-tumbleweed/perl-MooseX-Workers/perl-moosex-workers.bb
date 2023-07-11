SUMMARY = "Simple sub-process management for asynchronous tasks"
DESCRIPTION = "MooseX::Workers is a Role that provides easy delegation of long-running \
tasks into a managed child process. Process management is taken care of via \
POE and its POE::Wheel::Run module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-MooseX-Workers-0.24-1.26.noarch.rpm"
RPM_HASH = "da2ccb509fd5cc192f927bebee8e6a34f9f6bf7482118ce2ff1510b84c2ea4b58b9f6a3bb44e397921f90799072879b61727c854cc25fa51979348db3d30a23f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Workers \
perl-MooseX--Workers--Engine \
perl-MooseX--Workers--Job \
perl-MooseX-Workers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Moose--Role \
perl-POE \
perl-POE--Wheel--Run \
perl-Package--Stash \
perl-Try--Tiny"

inherit rpm
