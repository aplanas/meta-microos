SUMMARY = "Zsh Completion for kubeaudit"
DESCRIPTION = "zsh command line completion support for kubeaudit."
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-zsh-completion-0.22.0-1.2.noarch.rpm"
RPM_HASH = "83f1ced4a21c551c6891d64279ab2c8db46d99042de879af1e25ccfa22f57628755821d5f9c339ffaf404244aa889f4fed1badeaaaf51ba1fe60761bfb778fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubeaudit-zsh-completion"

RDEPENDS:${PN} += "kubeaudit"

inherit rpm
