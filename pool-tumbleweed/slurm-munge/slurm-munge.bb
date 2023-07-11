SUMMARY = "SLURM authentication and crypto implementation using Munge"
DESCRIPTION = "This package contains the SLURM authentication module for Chris Dunlap's Munge."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-munge-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "25fd9e5c760149caacf8cfc8ca5cda5d4241b87c2b19ce74e1f0c5ec33f34c106bdbeab8d63b4e3b1221a1019d7e1b67ffef262df3bafa4d88c4c195591ca05d"

RPROVIDES:${PN} += "slurm-auth-munge \
slurm-munge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2 \
munge \
slurm-plugins"

inherit rpm
