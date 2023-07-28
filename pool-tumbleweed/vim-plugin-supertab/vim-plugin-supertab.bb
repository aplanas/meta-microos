SUMMARY = "Easy insert mode completion with Tab key"
DESCRIPTION = "This script allows you to use the tab key to do all your insert completion."
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "vim-plugin-supertab-2.1-56.1.noarch.rpm"
RPM_HASH = "6ed35c109816f1bf7914652647a43f44b41da95a29ad125c5d805934c089227e0c260742467b8cb936c9b6fa755d1b35d149f69959296654ca289691f3279bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-supertab"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
