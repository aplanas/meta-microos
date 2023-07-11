SUMMARY = "Perl API to SLURM"
DESCRIPTION = "This package includes the Perl API to provide an interface to SLURM \
through Perl."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "perl-slurm-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "217f293ef3376ed671a7c21266240fd88e014733c91323c368df6a25b4bd1468722102edc4a2c79994f3ce2f468a8a2a1f875ab050f1550c8c9c047dbc0345dc"

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
perl--MODULE-COMPAT-5.36.1 \
slurm"

inherit rpm
