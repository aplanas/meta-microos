SUMMARY = "ZSH completion for konsole"
DESCRIPTION = "ZSH command line completion support for konsole."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konsole-zsh-completion-23.04.1-1.2.noarch.rpm"
RPM_HASH = "60870878f3b26f4955f4d106267b8861fd7c9069493a19995767dec40dcc2722468c8ad2792886b6da0ab4bd75c77fb01baaae23dde459d060545cac90b00bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konsole-zsh-completion"
RDEPENDS:${PN} += "konsole"

inherit rpm
