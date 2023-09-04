SUMMARY = "Simple sub-process management for asynchronous tasks"
DESCRIPTION = "MooseX::Workers is a Role that provides easy delegation of long-running \
tasks into a managed child process. Process management is taken care of via \
POE and its POE::Wheel::Run module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-MooseX-Workers-0.24-1.27.noarch.rpm"
RPM_HASH = "cc3b6296320f1d7b4766cce1fcfe6cde1e05e2f9ef2b9b8b2d32de8660cd564979cd55efe90580f5da90aeb603ac5be43ae47b93058a6ccf9a61fb3245be3f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Workers \
perl-MooseX--Workers--Engine \
perl-MooseX--Workers--Job \
perl-MooseX-Workers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Moose--Role \
perl-POE \
perl-POE--Wheel--Run \
perl-Package--Stash \
perl-Try--Tiny"

inherit rpm
