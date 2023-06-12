SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.33.6"

RPM_NAME = "chezmoi-zsh-completion-2.33.6-1.1.noarch.rpm"
RPM_HASH = "d1c30c38e6a6b1646608ade965d9aedc07e8b2139d7cf146533493497dae7cf994766d4bfc099e4f8aa1b6bee4c7133f8bafc2bf17db119e38c45a11291659b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"
RDEPENDS:${PN} += "chezmoi"

inherit rpm
