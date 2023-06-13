SUMMARY = "SLURM database daemon"
DESCRIPTION = "The SLURM database daemon provides accounting of jobs in a database."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-slurmdbd-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "9d1fe7aaff9843b48cc8a64309696f86dc5e7cbd40dc811d0bcdcbb10de0b8f59f9a484823d636e45423e333fb66dc058d8cfc65e7601662cbf7580f6c2430d7"

RPROVIDES:${PN} += "config(slurm-slurmdbd) \
slurm-slurmdbd \
slurm-slurmdbd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libslurmfull.so()(64bit) \
slurm-config \
slurm-plugins \
slurm-sql"

inherit rpm
