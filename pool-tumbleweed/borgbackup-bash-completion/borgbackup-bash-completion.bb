SUMMARY = "Bash Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the bash completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-bash-completion-1.2.4-1.3.noarch.rpm"
RPM_HASH = "3f2ed07609c68dc7445e64511ab2a6110ce740f9f140331e3febb31c03ab6f3f34238a1c4b2019ed645857c91711bd3c7df9684755b137b06c9004bb3807cf1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-bash-completion"

RDEPENDS:${PN} += "bash-completion \
borgbackup"

inherit rpm
