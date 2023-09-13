SUMMARY = "SLURM database daemon"
DESCRIPTION = "The SLURM database daemon provides accounting of jobs in a database."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-slurmdbd-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "062443795ce25914c666b3c794f18311f7d5d0dd29d06b418c048d3596fcce539efc1700d6f26fc8e37f535300fee108b72822e10098cee4221a335ea02b1c44"

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
