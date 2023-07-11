SUMMARY = "Zsh Completion for you-get"
DESCRIPTION = "ZSH command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-zsh-completion-0.4.1650-1.4.noarch.rpm"
RPM_HASH = "ee401ef7035e9ce8ce2aa049ed970ca59eb0ffcdd68b4a4641f0b7d0f50ce6df9b4668f6a87e286c748ba910e040b9cce6c33e7f0928aefe1bf290ba85309087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
