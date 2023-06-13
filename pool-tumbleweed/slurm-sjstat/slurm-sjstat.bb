SUMMARY = "Perl tool to print SLURM job state information"
DESCRIPTION = "This package contains a Perl tool to print SLURM job state information."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-sjstat-23.02.2-1.1.noarch.rpm"
RPM_HASH = "c6f1dcd126dee6bcb286d2bea92678b182a206a2db4d33b63b2a88981802102200bcddbbf86628ec740f230abe930aeabd30d18674c389207bdf3a4421b38e6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-sjstat"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
slurm"

inherit rpm
