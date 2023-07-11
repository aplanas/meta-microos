SUMMARY = "NSS Plugin for SLURM"
DESCRIPTION = "libnss_slurm is an optional NSS plugin that permits password and group \
resolution for a job on a compute node to be serviced through the local \
slurmstepd process."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libnss_slurm2-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "e4c8c1f01b54f8f2d186399d4d46e43a99018828f0b93442615e9d3879b5dcac267c42447bd8a3562418d2d13c83ab1c65cc9504a56273b47b2c511fa845d087"

RPROVIDES:${PN} += "config-libnss-slurm2 \
libnss-slurm.so.2 \
libnss-slurm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39"

inherit rpm
