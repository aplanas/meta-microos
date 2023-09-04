SUMMARY = "Libraries for SLURM"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libslurm39-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "fd53e4e89b9e80fa2bbfc89cfd6c0bba6a8a34b68bd3fc5a27fb3d8fd836350bd4084b26eb2e3d39381c29c6de7fa1abbb679c68d54497923adf5c926bf5aecb"

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
