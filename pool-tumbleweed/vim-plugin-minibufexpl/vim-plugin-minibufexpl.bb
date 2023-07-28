SUMMARY = "Elegant buffer explorer that takes very little screen space"
DESCRIPTION = "Minibufexplorer allows to quickly switch buffers by double-clicking the \
appropriate 'tab'. Tabs get updated as buffers are opened and closed. \
Buffers that are modified get visually marked and buffers that are open in a \
window get visually marked."
LICENSE = "ISC"

PV = "6.3.2"

RPM_NAME = "vim-plugin-minibufexpl-6.3.2-56.1.noarch.rpm"
RPM_HASH = "cae31aa451263bc6dfda963848f75da506e198e29bd3f2e3a39ecbd4178c6fe0610458b3b13afd5c5393aa23e24e91c3ab9f395e3b173849da010f0b7fc15122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-minibufexpl"

RDEPENDS:${PN} += "vim"

inherit rpm
