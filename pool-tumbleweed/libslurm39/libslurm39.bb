SUMMARY = "Libraries for SLURM"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libslurm39-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "bd661343041ea5bf7db92ffe80fb40a3c99e49de896fa1d22c31207b25af0d89cd666642523f7d2d9b770003e0df8e7e45858f358bd93873231bcebd988b62be"

RPROVIDES:${PN} += "libslurm \
libslurm.so.39 \
libslurm39"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libresolv.so.2 \
slurm-config"

inherit rpm
