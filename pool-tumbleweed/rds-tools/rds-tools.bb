SUMMARY = "Support tools for Reliable Datagram Sockets"
DESCRIPTION = "A collection of support tools for the RDS socket API."
LICENSE = "BSD-3-Clause | GPL-2.0"

PV = "2.0.7"

RPM_NAME = "rds-tools-2.0.7-2.24.aarch64.rpm"
RPM_HASH = "e80cfc739f553ee99aee418351fc5ad35bf3b58effd13730aebf31f2ddd691cc7c34107fe2a73d8e0d7f7a4c4ed0f14dcdc9c97570da9d4b2788bf86d70eb42c"

RPROVIDES:${PN} += "rds-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
