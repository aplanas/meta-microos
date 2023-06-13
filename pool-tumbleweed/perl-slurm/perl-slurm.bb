SUMMARY = "Perl API to SLURM"
DESCRIPTION = "This package includes the Perl API to provide an interface to SLURM \
through Perl."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "perl-slurm-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "a74c7bb5c86a511903674c802460d1d8cd362ef3bfd5ed264854932a1370de4c1bf8bdeb81c44492622eec925823a89621903352866ce645f1c8ed66f512bcec"

RPROVIDES:${PN} += "perl(Slurm) \
perl(Slurm::Bitstr) \
perl(Slurm::Constant) \
perl(Slurm::Hostlist) \
perl(Slurmdb) \
perl-slurm \
perl-slurm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libslurm.so.39()(64bit) \
perl \
perl(:MODULE_COMPAT_5.36.0) \
slurm"

inherit rpm
