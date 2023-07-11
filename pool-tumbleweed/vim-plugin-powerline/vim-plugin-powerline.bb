SUMMARY = "Powerline VIM plugin"
DESCRIPTION = "Powerline is a status line plugin for vim, and provides status lines and \
prompts."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "vim-plugin-powerline-2.8.3-3.1.noarch.rpm"
RPM_HASH = "c6d4d2f9bc1e4db23857a28b1292c22cb745cde4847076728fac5e27fa3b03a0bb3701ac8f0acb9043aba16715da88345e4ce0d38a6bdf11893f0327036dd81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-powerline"

RDEPENDS:${PN} += "powerline \
vim"

inherit rpm
