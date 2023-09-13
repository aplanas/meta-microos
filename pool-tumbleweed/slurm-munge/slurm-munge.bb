SUMMARY = "SLURM authentication and crypto implementation using Munge"
DESCRIPTION = "This package contains the SLURM authentication module for Chris Dunlap's Munge."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-munge-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "e257ce2a55420bff1836314cc0f70773934e7aafe0868816dc31ef38521550e1ca73a396d770b7a5d84aa12ccf6e6622a4f1ef50e95d4a1d2dd87663035de736"

RPROVIDES:${PN} += "slurm-auth-munge \
slurm-munge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2 \
munge \
slurm-plugins"

inherit rpm
