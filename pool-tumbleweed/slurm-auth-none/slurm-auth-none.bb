SUMMARY = "SLURM auth NULL implementation (no authentication)"
DESCRIPTION = "This package cobtains the SLURM NULL authentication module."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-auth-none-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "083f5232387d6dd727322a1dd19495e10721e5e302390bde3fcc670060051dcd69f68f66c85bf879a7dc09a289010947a25d895f3370e5d634255f373a55cb5a"

RPROVIDES:${PN} += "slurm-auth-none"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
slurm"

inherit rpm
