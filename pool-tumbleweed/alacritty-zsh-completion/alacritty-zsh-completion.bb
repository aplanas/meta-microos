SUMMARY = "ZSH Completion for alacritty"
DESCRIPTION = "The official zsh completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.2"

RPM_NAME = "alacritty-zsh-completion-0.12.2-1.1.noarch.rpm"
RPM_HASH = "fb0b354fdfe61b171e2dceeaadfe507b0d149252246db27908bf8fb6fac09e96d57115a28aeb4a0843d4aa7e318c82cfe0194b363306a49ec1ed57f1aadc8b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-zsh-completion"

RDEPENDS:${PN} += ""

inherit rpm
