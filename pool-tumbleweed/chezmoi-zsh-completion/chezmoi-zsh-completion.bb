SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.36.1"

RPM_NAME = "chezmoi-zsh-completion-2.36.1-1.1.noarch.rpm"
RPM_HASH = "eef7e4493dfdd6d7dcb87be92a9a551ed4b6692739e99e9ef4098d747db0f5018232685f4163eb93e4f496642c5ac79cd4473cecbf8a7c69db6d8164f1d25b0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
