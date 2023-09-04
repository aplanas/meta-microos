SUMMARY = "ZSH Completion for gh"
DESCRIPTION = "ZSH command line completion support for gh."
LICENSE = "MIT"

PV = "2.33.0"

RPM_NAME = "gh-zsh-completion-2.33.0-1.1.noarch.rpm"
RPM_HASH = "0b22630e86e5830b30fc44d9ea9a2c1efa7ddaa4ed6b5b593d5c40cb814b76e782378a47490b396cdb84fa235c350a7ee411d07c6707d039ebee63ddd005add4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-zsh-completion"

RDEPENDS:${PN} += "gh"

inherit rpm
