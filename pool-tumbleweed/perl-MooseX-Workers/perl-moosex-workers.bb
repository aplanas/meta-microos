SUMMARY = "Simple sub-process management for asynchronous tasks"
DESCRIPTION = "MooseX::Workers is a Role that provides easy delegation of long-running \
tasks into a managed child process. Process management is taken care of via \
POE and its POE::Wheel::Run module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.24"

RPM_NAME = "perl-MooseX-Workers-0.24-1.25.noarch.rpm"
RPM_HASH = "72b975999875bcbff4281434c528d7998436ecc37ccff3de863be1b0141c1adfb0120e4bdce3f4f41a3425e3f27431f14666d5e325816114b00af27d9fdca1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Workers) \
perl(MooseX::Workers::Engine) \
perl(MooseX::Workers::Job) \
perl-MooseX-Workers"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Moose::Role) \
perl(POE) \
perl(POE::Wheel::Run) \
perl(Package::Stash) \
perl(Try::Tiny)"

inherit rpm
