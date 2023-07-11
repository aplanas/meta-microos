SUMMARY = "NVM Express user space tools zsh completion"
DESCRIPTION = "Optional dependency offering zsh completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-zsh-completion-2.4-1.2.noarch.rpm"
RPM_HASH = "4014d0f0cad574929c0200d7b7fabb4f762f71b95be75e47f13d9600124c658623d61207aca2e348ca19c8d76a0574979a2be3acff08c85a2ca3752aa99c2c22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-zsh-completion"

RDEPENDS:${PN} += "nvme-cli \
zsh"

inherit rpm
