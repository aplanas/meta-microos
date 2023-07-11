SUMMARY = "Translations for package neovim"
DESCRIPTION = "Provides translations for the 'neovim' package."
LICENSE = "Apache-2.0 & Vim"

PV = "0.9.1"

RPM_NAME = "neovim-lang-0.9.1-1.1.noarch.rpm"
RPM_HASH = "727d935424e557ebd254cacabc030afed00e2a3f30efa17df5417eb7d39962b874429de259e85d5ddcc7d3aae4c87154b021f3d87d03b696fd06608f7bb88d87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-neovim-af \
locale-neovim-ca \
locale-neovim-cs \
locale-neovim-da \
locale-neovim-de \
locale-neovim-en-GB \
locale-neovim-eo \
locale-neovim-es \
locale-neovim-fi \
locale-neovim-fr \
locale-neovim-ga \
locale-neovim-it \
locale-neovim-ja \
locale-neovim-nb \
locale-neovim-nl \
locale-neovim-pt-BR \
locale-neovim-ru \
locale-neovim-sk \
locale-neovim-sv \
locale-neovim-tr \
locale-neovim-uk \
locale-neovim-vi \
neovim-lang \
neovim-lang-all"

RDEPENDS:${PN} += "neovim"

inherit rpm
