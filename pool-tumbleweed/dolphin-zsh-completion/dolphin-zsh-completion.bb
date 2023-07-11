SUMMARY = "ZSH completion for dolphin"
DESCRIPTION = "ZSH command line completion support for dolphin."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "dolphin-zsh-completion-23.04.3-1.1.noarch.rpm"
RPM_HASH = "04ace11691f082c05bfc958c801afedb2c6e159401a4e2c00e5122b43dd8427036ae95d94d5a384ab9f8af983f7dca6a39fd2f719772778a718cafe3298caadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-zsh-completion"

RDEPENDS:${PN} += "dolphin"

inherit rpm
