SUMMARY = "SLURM PMI Library"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libpmi0-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "fef24de5a8711a9d40201843e901e0c7793bc399ebda77fc706681d28d723d41377f4866c254eae6c58d72520fb730d9b6f342be0bd75cb73f166ffff4ff4bc9"

RPROVIDES:${PN} += "libpmi.so.0 \
libpmi0 \
libpmi2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm-pmi.so"

inherit rpm
