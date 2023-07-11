SUMMARY = "Fish Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the fish completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-fish-completion-1.2.4-1.3.noarch.rpm"
RPM_HASH = "ad03afefd56277c5d958796fa18c695b7bc1036836f686b60eb9765b6854eab7d062374a1ce865cbc5a9ce92b2716a5e7e8f823cf7d22df8cbb2316405a94dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-fish-completion"

RDEPENDS:${PN} += "borgbackup \
fish"

inherit rpm
