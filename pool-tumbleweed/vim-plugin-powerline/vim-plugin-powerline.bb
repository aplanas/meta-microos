SUMMARY = "Powerline VIM plugin"
DESCRIPTION = "Powerline is a status line plugin for vim, and provides status lines and \
prompts."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "vim-plugin-powerline-2.8.3-2.2.noarch.rpm"
RPM_HASH = "ee8864d640d79b7414ca48224c988acdc46c096c03742a0ac7dd3ca1ea327504815bce612d285cb42a90f5f389fa3f734371b09247005e3c261bbe65f0203ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-powerline"
RDEPENDS:${PN} += "powerline \
vim"

inherit rpm
