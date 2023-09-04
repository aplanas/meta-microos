SUMMARY = "Zsh Completion for lf"
DESCRIPTION = "Zsh command-line completion support for lf."
LICENSE = "MIT"

PV = "30+dd82949"

RPM_NAME = "lf-zsh-completion-30+dd82949-1.1.noarch.rpm"
RPM_HASH = "fdb057c69485650ce6e75deb9956ca6879d6ffec7b4d7334bfdccb5d14275ae469faad3925d7db07566303c91e1bfa7d9564ec6b5d0f8dad311f7cdd08dfe5d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lf-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
