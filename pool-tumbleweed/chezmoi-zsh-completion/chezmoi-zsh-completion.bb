SUMMARY = "Zsh completion for chezmoi"
DESCRIPTION = "Zsh command line completion support for chezmoi."
LICENSE = "MIT"

PV = "2.35.0"

RPM_NAME = "chezmoi-zsh-completion-2.35.0-1.1.noarch.rpm"
RPM_HASH = "0245ae1bd81dc231e7f0a0c9648b019af5a6a2d50ab34e452bc0432ab68601605bfeebe5d1af4408f7d0ec1568720a4c71d14ed9e620a63cc30a5912a3ac5854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chezmoi-zsh-completion"

RDEPENDS:${PN} += "chezmoi"

inherit rpm
