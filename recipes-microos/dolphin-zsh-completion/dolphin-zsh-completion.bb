SUMMARY = "ZSH completion for dolphin"
DESCRIPTION = "ZSH command line completion support for dolphin."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "dolphin-zsh-completion-23.04.0-2.1.noarch.rpm"
RPM_HASH = "37f03e9f422b05671ec924b1137c0e58b51d8f67f50f9bdc6276742714f06343bc0c1122421b759cd532f06c1dc34ef83ec0a385b7e70b68fe3786764c316c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-zsh-completion"
RDEPENDS:${PN} += "dolphin"

inherit rpm
