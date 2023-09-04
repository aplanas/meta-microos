SUMMARY = "Bash Completion for zellij"
DESCRIPTION = "Bash command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.37.2"

RPM_NAME = "zellij-bash-completion-0.37.2-2.1.noarch.rpm"
RPM_HASH = "7e3d1a624bb81f8e23ae12af6db670326ae07f6de26aac6f96425c606dfd174e06221b33f178624bd47d7314ba4960aacd39d7507d1057d9c6007a14e33a1d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
