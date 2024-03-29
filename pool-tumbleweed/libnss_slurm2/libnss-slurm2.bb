SUMMARY = "NSS Plugin for SLURM"
DESCRIPTION = "libnss_slurm is an optional NSS plugin that permits password and group \
resolution for a job on a compute node to be serviced through the local \
slurmstepd process."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "libnss_slurm2-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "f9d5504c5d9a15e60261fd681dd153fe1ba6f9ae69904044820bdeb2114c4fbfedfaa266fe070f7cc1a539e0d62345e4bb6a2b304fce82176772935be4422dab"

RPROVIDES:${PN} += "config-libnss-slurm2 \
libnss-slurm.so.2 \
libnss-slurm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm.so.39"

inherit rpm
