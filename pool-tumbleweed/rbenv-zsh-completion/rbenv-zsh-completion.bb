SUMMARY = "ZSH completion for rbenv"
DESCRIPTION = "The official zsh completion script for rbenv."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "rbenv-zsh-completion-1.2.0-1.4.noarch.rpm"
RPM_HASH = "fe3dd95a2ef1cb7defc1b3291ca649bc88287f0f0983ad5c3b76de9efd5a7821cfb151802282480757eb3bb0140a16f7367c20893bb8acf77d8736dc04387bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbenv-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
