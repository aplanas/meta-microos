SUMMARY = "Translations for package neovim"
DESCRIPTION = "Provides translations for the 'neovim' package."
LICENSE = "Apache-2.0 & Vim"

PV = "0.9.2"

RPM_NAME = "neovim-lang-0.9.2-1.1.noarch.rpm"
RPM_HASH = "ba56fdec42b8af7499ede7d0b91b4019aff2a6ea43e392ab2ecac81ea7c1f758489238534f93ba9de0bb0866013bacf4a8255d00ae5da35b41e1009b9946fe78"
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
