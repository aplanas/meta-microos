SUMMARY = "Vim plugin for fzf"
DESCRIPTION = "Plugin for vim allowing use of fzf."
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "vim-fzf-0.42.0-1.2.noarch.rpm"
RPM_HASH = "d02ece7b326236fa049a9c587dc18fc0221e08240d492080882ee0e6fd85788a7fa6b12b7c9e2739b3a908f58581a865db872787f1727145f4d5a27f38a36847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-fzf"

RDEPENDS:${PN} += ""

inherit rpm
