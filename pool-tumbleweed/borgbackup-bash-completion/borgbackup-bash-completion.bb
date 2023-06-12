SUMMARY = "Bash Completion for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
This package contains the bash completion script for borgbackup."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-bash-completion-1.2.4-1.1.noarch.rpm"
RPM_HASH = "dae3912528fc047c5fc3e59addd5b68c3e937dd4738f48cb895ccfb987e0589bd76e30ab049935824853b06345696f9a26fc67cbf4020ba6216ac406295ec695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-bash-completion"
RDEPENDS:${PN} += "bash-completion \
borgbackup"

inherit rpm
