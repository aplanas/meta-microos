SUMMARY = "ZSH Completion for alacritty"
DESCRIPTION = "The official zsh completion script for alacritty."
LICENSE = "Apache-2.0"

PV = "0.12.0"

RPM_NAME = "alacritty-zsh-completion-0.12.0-1.1.noarch.rpm"
RPM_HASH = "e262055e5a7b313a8474c405524c246841e5f51c88636003d54df7eb18b6463b24c4a48b195ea8bd6b9a8f87b7b52d7031ac1cda93ef6a9b36db31bd1fb52957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacritty-zsh-completion"
RDEPENDS:${PN} += ""

inherit rpm
