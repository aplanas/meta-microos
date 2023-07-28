SUMMARY = "VIM Table Mode for instant table creation."
DESCRIPTION = "An awesome automatic table creator & formatter allowing one to \
create neat tables as you type."
LICENSE = "MIT"

PV = "4.7.6.1"

RPM_NAME = "vim-plugin-table-mode-4.7.6.1-56.1.noarch.rpm"
RPM_HASH = "3df2108083931ba9dba50531a71f7cae57f4fd94ba5d4b768f0f6920e75bec5d14f7c316151208094b4a2df9f39d19fb33ec8e569c42b5c08dd63a658c30ae8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-table-mode"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
