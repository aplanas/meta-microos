SUMMARY = "Slurm REST API Interface"
DESCRIPTION = "This package provides the interface to SLURM via REST API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-rest-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "5166e98bc2f653422967df154bf97185d89e2120c3f7a438a0df3518fca592d8d45b22c4bcae7229427b1acafa10f3706b631b2b1392d4fa102e5342a908770a"

RPROVIDES:${PN} += "slurm-rest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhttp-parser.so.2.9 \
libslurmfull.so \
slurm-config"

inherit rpm
