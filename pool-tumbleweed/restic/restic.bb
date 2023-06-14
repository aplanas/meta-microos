SUMMARY = "Backup program with deduplication and encryption"
DESCRIPTION = "restic is a backup program. It supports verification, encryption, \
snapshots and deduplication."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-0.15.2-1.2.aarch64.rpm"
RPM_HASH = "a7567fcda3f2fdb4e3df387db7cf6c9c76f0322998d400a09742b1fe9d8551fe6d0c99486187f83a79d1871e3874d1878bf8d65985d9e86f7795ef8d51cfa985"

RPROVIDES:${PN} += "restic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
