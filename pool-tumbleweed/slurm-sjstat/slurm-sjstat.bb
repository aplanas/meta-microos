SUMMARY = "Perl tool to print SLURM job state information"
DESCRIPTION = "This package contains a Perl tool to print SLURM job state information."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sjstat-23.02.2-1.4.noarch.rpm"
RPM_HASH = "179b8c3e662e3c22808c6e94c1b75e20a0f623327c3c311cb4231702175114e7481843b8c7304f45cb1d60085c644acae51cd01e241743691380dcd792a86ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-sjstat"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
slurm"

inherit rpm
