SUMMARY = "Perl tool to print SLURM job state information"
DESCRIPTION = "This package contains a Perl tool to print SLURM job state information."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sjstat-23.02.2-1.3.noarch.rpm"
RPM_HASH = "b19e54a47d5e3caf0c6e4ec46368fca5718b60926ef27841c3f706987c16dc70198cd4c7a43a7cb31c34e90664feafe9638645554fe2c25d67cf96a05f55e77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-sjstat"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
slurm"

inherit rpm
