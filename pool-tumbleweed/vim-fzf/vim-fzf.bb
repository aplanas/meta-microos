SUMMARY = "Vim plugin for fzf"
DESCRIPTION = "Plugin for vim allowing use of fzf."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "vim-fzf-0.41.0-1.1.noarch.rpm"
RPM_HASH = "a11c41d427f6531e115c345782037bbeea0e6414c2b6d7ffed592a87eba1af5663c15f5c0407e901e3bfa039e44ea5987106df34fae224fd59103721623b7cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-fzf"

RDEPENDS:${PN} += "(vim or neovim)"

inherit rpm
