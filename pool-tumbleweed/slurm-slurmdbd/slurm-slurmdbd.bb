SUMMARY = "SLURM database daemon"
DESCRIPTION = "The SLURM database daemon provides accounting of jobs in a database."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-slurmdbd-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "2a0ba45a9cda3f85868c9b3c910732fefe7086f87909d063dae29ffe5efcac8f909008c0e2246d7589acd9ea5678ca2abc8c05830df6d3de8bfa4437dac99a10"

RPROVIDES:${PN} += "config-slurm-slurmdbd \
slurm-slurmdbd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurmfull.so \
slurm-config \
slurm-plugins \
slurm-sql"

inherit rpm
