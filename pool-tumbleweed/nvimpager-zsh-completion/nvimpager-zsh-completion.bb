SUMMARY = "Zsh completion for nvimpager"
DESCRIPTION = "Zsh command line completion support for nvimpager."
LICENSE = "BSD-2-Clause"

PV = "0.12.0"

RPM_NAME = "nvimpager-zsh-completion-0.12.0-1.1.noarch.rpm"
RPM_HASH = "7e795dfeedd4bda4c82b530deb97c70232b71dec59343f2f6027299999899e8af9460754d046981e627b881d7f789554b07344af67f84f8e5192ded66d1c31b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvimpager-zsh-completion"
RDEPENDS:${PN} += "nvimpager \
zsh"

inherit rpm
