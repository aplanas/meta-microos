SUMMARY = "NSS Plugin for SLURM"
DESCRIPTION = "libnss_slurm is an optional NSS plugin that permits password and group \
resolution for a job on a compute node to be serviced through the local \
slurmstepd process."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libnss_slurm2-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "02a154a1b4893a498fc085ff524c825bbef4105ae7a087bfd3584794020163273297101121e7a5925a04cabb328fd32d9d04d229ed1c764cd0879f4595f93372"

RPROVIDES:${PN} += "config-libnss-slurm2 \
libnss-slurm.so.2 \
libnss-slurm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39"

inherit rpm
