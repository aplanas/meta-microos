SUMMARY = "Bash completion for you-get"
DESCRIPTION = "Bash command line completion support for you-get."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-bash-completion-0.4.1650-1.4.noarch.rpm"
RPM_HASH = "9163bee54769a9b9e74f78f13e6d57c21883075a63a57bfc858d5ab6647696ff29f8d62c16f3853a9dcc47213a36541ff1251534d12d4bd649d15b6ad999d734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "you-get-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
