SUMMARY = "Backup program with deduplication and encryption"
DESCRIPTION = "restic is a backup program. It supports verification, encryption, \
snapshots and deduplication."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-0.15.2-1.3.aarch64.rpm"
RPM_HASH = "ebceda8436f1e29cba697d0787602ebb792c01e5d52a813255cd0767d738bce7925e155d3fd0213cda23f2833ebe888d2df5a2e872ee845c94e0d1a0866b1c91"

RPROVIDES:${PN} += "restic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
