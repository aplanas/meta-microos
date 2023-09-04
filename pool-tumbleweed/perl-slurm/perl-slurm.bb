SUMMARY = "Perl API to SLURM"
DESCRIPTION = "This package includes the Perl API to provide an interface to SLURM \
through Perl."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "perl-slurm-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "38e08f8dae29afd1138e82c324cc3ad1188eb88da91c73c2648c6f4a668337ccb0ca82fe7707162e23703b1a8ab022ebc233b77bc242b8021f8a2af1afed63ae"

RPROVIDES:${PN} += "perl-Slurm \
perl-Slurm--Bitstr \
perl-Slurm--Constant \
perl-Slurm--Hostlist \
perl-Slurmdb \
perl-slurm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39 \
perl \
perl--MODULE-COMPAT-5.38.0 \
slurm"

inherit rpm
