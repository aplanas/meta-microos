SUMMARY = "NVM Express user space tools zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-zsh-completion-2.4-2.1.noarch.rpm"
RPM_HASH = "834e6cd00bf7e630a477f8b32e807fe3d2e24c91c24f1683251435ed1954172a247621e94a25c41dd0b2a3db9240cdb8b7ace38f7e44e19f0a350a2391ed66ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-zsh-completion"

RDEPENDS:${PN} += "nvme-cli \
zsh"

inherit rpm
