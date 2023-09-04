SUMMARY = "SLURM authentication and crypto implementation using Munge"
DESCRIPTION = "This package contains the SLURM authentication module for Chris Dunlap's Munge."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-munge-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "51b9b8c0d6eb9e94492d46805119543d722218b9497086d92948bdde672aac39560f05130e819e9d3e1049fc2e77fee511b8915893993067ad8b7ce09eaf9210"

RPROVIDES:${PN} += "slurm-auth-munge \
slurm-munge"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmunge.so.2 \
munge \
slurm-plugins"

inherit rpm
