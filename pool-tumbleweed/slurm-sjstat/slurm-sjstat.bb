SUMMARY = "Perl tool to print SLURM job state information"
DESCRIPTION = "This package contains a Perl tool to print SLURM job state information."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-sjstat-23.02.4-2.1.noarch.rpm"
RPM_HASH = "9d4957d4ab80c562cb4a49ebfe880ae1ffa1483f8ff88cdb34a3257db199fcc6609d78725c92bea8fa26774685d9b24b86080957c7d810359a5d21edb933558e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-sjstat"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
slurm"

inherit rpm
