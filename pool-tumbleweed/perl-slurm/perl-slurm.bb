SUMMARY = "Perl API to SLURM"
DESCRIPTION = "This package includes the Perl API to provide an interface to SLURM \
through Perl."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "perl-slurm-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "4fc5a92b84b9a78679908490f3f131c5f87af25432fe7108e37a4060af6e5442b95f9caa975742d2b7ae7a343e86f89dbd19ecc2c47d196a4ee44688c6dccc2d"

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
