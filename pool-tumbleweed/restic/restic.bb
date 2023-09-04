SUMMARY = "Backup program with deduplication and encryption"
DESCRIPTION = "restic is a backup program. It supports verification, encryption, \
snapshots and deduplication."
LICENSE = "BSD-2-Clause"

PV = "0.16.0"

RPM_NAME = "restic-0.16.0-1.1.aarch64.rpm"
RPM_HASH = "1cb5de6281c93e4c1119de1ef39c02a88ec9c4c6933748d911e5f888d8bc8b082b8a6c7d3ccebf076beb64e24e6b53bdb2da9972be569132dd4d228b3b3d1656"

RPROVIDES:${PN} += "restic"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
