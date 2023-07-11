SUMMARY = "ZSH Completion for catimg"
DESCRIPTION = "The official zsh completion script for catimg."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "catimg-zsh-completion-2.7.0-1.7.noarch.rpm"
RPM_HASH = "3f125849db46467cebb891a5df5b9be3e7ed719e02ceb246adaf990e5e0bfc7e0f847287d1c493014547823376df417e367338193619449df10ce6a8be8d3af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catimg-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
