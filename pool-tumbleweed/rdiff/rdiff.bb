SUMMARY = "Frontend to rsync's delta algorithm"
DESCRIPTION = "rdiff computes and applies signature-based file differences."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.4"

RPM_NAME = "rdiff-2.3.4-1.2.aarch64.rpm"
RPM_HASH = "f9e669d1707a375741fd53db2999e85ee9ab81fc6f26f8290706ec978c9f0d925e912f75bcc72cd4fe72ffd9c0351ae8c68cc9c762822668408e377bba2494b4"

RPROVIDES:${PN} += "rdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0 \
librsync.so.2"

inherit rpm
