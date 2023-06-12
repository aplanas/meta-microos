SUMMARY = "Zsh Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the zsh completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-zsh-completion-1.2.4-1.1.noarch.rpm"
RPM_HASH = "cd378b09849cd140543b54009daf993cd9a642f274a0d07b577db655d94cfee0a8413e50c26b22c9bb88617c0e3fbd407c72bc99bc5e0277433c2710fc11d9a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-zsh-completion"
RDEPENDS:${PN} += "borgbackup \
zsh"

inherit rpm
