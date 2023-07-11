SUMMARY = "Slurm REST API Interface"
DESCRIPTION = "This package provides the interface to SLURM via REST API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-rest-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "2e33e3f6db8b77b60da5b6ed3fe5295f3b9035bb37f8ae7f68ff66cd3f74fd98b61c0cd42417400187047a4d760c475db19cc61da949d8466cd7a9567a90583c"

RPROVIDES:${PN} += "slurm-rest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhttp-parser.so.2.9 \
libslurmfull.so \
slurm-config"

inherit rpm
