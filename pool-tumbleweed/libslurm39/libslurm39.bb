SUMMARY = "Libraries for SLURM"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "libslurm39-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "990cf4fc391e954ac87007f1d26dcff10013b9227024c4481a34d6ef4739b673bc6895a0fb0a94b88c5ae165f94dcef85edc1e18d3184631b073d01964861bee"

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
