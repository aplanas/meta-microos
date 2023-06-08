SUMMARY = "Fish Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the fish completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-fish-completion-1.2.4-1.1.noarch.rpm"
RPM_HASH = "4d42c15da7499314f594a2b147f24bda9b038cebc2136f4a27356554f16f63257e9e481d88a0292bde8b0adcccdfa39ff6b95a9f5dbada2f3717b420fc69bc1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-fish-completion"
RDEPENDS:${PN} += "borgbackup fish"

inherit rpm
