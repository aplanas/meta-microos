SUMMARY = "Zsh completion for pyenv"
DESCRIPTION = "Zsh command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.25"

RPM_NAME = "pyenv-zsh-completion-2.3.25-1.1.noarch.rpm"
RPM_HASH = "8173eff13676ced53dc49fb7711a17cd94c9e1ce2215128d96b70543a4281dd8bb0942a59668fd8302e09454b5f035c80aa75eb5cd8cdb996fd854342d369359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pyenv-zsh-completion \
pyenv-zsh-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
