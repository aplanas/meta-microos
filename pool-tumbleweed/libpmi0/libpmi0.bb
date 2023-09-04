SUMMARY = "SLURM PMI Library"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "libpmi0-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "21b65ee816959c517b6874dc879ce693fc09fb3817edf37e2bf1821625bd3b3968974e8341d0306e2ea3faed63b6f2e844e51938c0252400b2078612d8581eb5"

RPROVIDES:${PN} += "libpmi.so.0 \
libpmi0 \
libpmi2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm-pmi.so"

inherit rpm
