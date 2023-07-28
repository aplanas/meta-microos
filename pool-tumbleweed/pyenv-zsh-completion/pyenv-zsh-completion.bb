SUMMARY = "Zsh completion for pyenv"
DESCRIPTION = "Zsh command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.22"

RPM_NAME = "pyenv-zsh-completion-2.3.22-1.1.noarch.rpm"
RPM_HASH = "9e4b520dfe48552d71e61d3a595345a5ef717db7b6eb75e983e0978f0f0fd2e1e39645bf7916a2744fdff2f18e8d3b7f56601a9a131ba37d76f56f65d61d2bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pyenv-zsh-completion \
pyenv-zsh-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
