SUMMARY = "Zsh Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the zsh completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-zsh-completion-1.2.4-1.3.noarch.rpm"
RPM_HASH = "6cd731fa3bdbd1101f81d66f979b34463bb73003103e6d55821bd6a1f86626b43f7fc50530bf6aa3c6999534ac441281fa673ac333bf479a1233bfd2bd7f560b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-zsh-completion"

RDEPENDS:${PN} += "borgbackup \
zsh"

inherit rpm
