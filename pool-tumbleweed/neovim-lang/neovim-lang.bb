SUMMARY = "Translations for package neovim"
DESCRIPTION = "Provides translations for the 'neovim' package."
LICENSE = "Apache-2.0 & Vim"

PV = "0.9.0"

RPM_NAME = "neovim-lang-0.9.0-1.1.noarch.rpm"
RPM_HASH = "1fac0f1b5b61cc799129ba3a70256e2cd886e53d210d1f50cca6c885322929fee947be8ab81e29c696211c2aac7c297ccecf2859f5c23b21f3e6f7f9b0b58fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(neovim:af) \
locale(neovim:ca) \
locale(neovim:cs) \
locale(neovim:da) \
locale(neovim:de) \
locale(neovim:en_GB) \
locale(neovim:eo) \
locale(neovim:es) \
locale(neovim:fi) \
locale(neovim:fr) \
locale(neovim:ga) \
locale(neovim:it) \
locale(neovim:ja) \
locale(neovim:nb) \
locale(neovim:nl) \
locale(neovim:pt_BR) \
locale(neovim:ru) \
locale(neovim:sk) \
locale(neovim:sv) \
locale(neovim:tr) \
locale(neovim:uk) \
locale(neovim:vi) \
neovim-lang \
neovim-lang-all"

RDEPENDS:${PN} += "neovim"

inherit rpm
