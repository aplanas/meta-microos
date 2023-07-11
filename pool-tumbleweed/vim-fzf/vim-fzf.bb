SUMMARY = "Vim plugin for fzf"
DESCRIPTION = "Plugin for vim allowing use of fzf."
LICENSE = "MIT"

PV = "0.42.0"

RPM_NAME = "vim-fzf-0.42.0-1.1.noarch.rpm"
RPM_HASH = "12fc601b83192e6ee9ef0b91803465b5ee8a0b19da7c11804de78653e3c25c3afbe86cc064c7dc02b23f5a30f704a1544015fea2ddca7173c243917cac2456d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-fzf"

RDEPENDS:${PN} += ""

inherit rpm
