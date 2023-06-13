SUMMARY = "Zsh Completion for you-get"
DESCRIPTION = "ZSH command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-zsh-completion-0.4.1650-1.3.noarch.rpm"
RPM_HASH = "78f980bc7bcd2e07a260e09b540fd566ee9a528ed530d3c33398e6a5b8ba36eff87ea54c9cb102498e15f26063405211eb679a7c6ecb5eb0918962273ecb2194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
