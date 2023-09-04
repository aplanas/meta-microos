SUMMARY = "SLURM database daemon"
DESCRIPTION = "The SLURM database daemon provides accounting of jobs in a database."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-slurmdbd-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "0f168468edbc1c87b5fddff8afcea2b2c142c7607b19269ecf98f4ecb2c75adf0b86cd92b3e6200013f56e5f46c3579d35e1ea926bdb2d2d8ffa5a0651849e5b"

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
