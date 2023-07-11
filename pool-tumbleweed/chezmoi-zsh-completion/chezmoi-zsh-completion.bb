SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.34.3"

RPM_NAME = "chezmoi-zsh-completion-2.34.3-1.1.noarch.rpm"
RPM_HASH = "bbb1199d7761a0068e74c240726717b4878e7dcb91fb6d1bcbb093b6e23ee189ab2062b080219cbd3944872d3f4459f05233b70086034f28fbedcddf86dc866d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
