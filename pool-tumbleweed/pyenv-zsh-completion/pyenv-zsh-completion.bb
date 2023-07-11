SUMMARY = "Zsh completion for pyenv"
DESCRIPTION = "Zsh command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.21"

RPM_NAME = "pyenv-zsh-completion-2.3.21-1.1.noarch.rpm"
RPM_HASH = "e11271d3c1e3b515448a502189622fb34830a74de4b60c8b84c5403f501f2712bbd150cd9cb1bb6a5899d05def23e4c3de881342b46ce0ce61951a40f6319e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pyenv-zsh-completion \
pyenv-zsh-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
