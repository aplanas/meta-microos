SUMMARY = "NVM Express user space tools bash completion"
DESCRIPTION = "Optional dependency offering bash completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-bash-completion-2.4-2.1.noarch.rpm"
RPM_HASH = "9cfb0c7a2945c893a019520ebefb6859bb3f8da2f0f67007b09e07ad30898614d7697e1ef8104b74f5d32a9b6a239a6be9c1813aa6caac81baf691de7b6513db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-bash-completion"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
nvme-cli"

inherit rpm
