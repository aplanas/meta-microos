SUMMARY = "Bash completion for pyenv"
DESCRIPTION = "Bash command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.25"

RPM_NAME = "pyenv-bash-completion-2.3.25-1.1.noarch.rpm"
RPM_HASH = "aad36fad3572f5901b550589699da5609a500e57f0422a1ba24480d05321b680279a9c94571fbf1cdcc7615082103266ea028a4a188ba24a38dcee961bf18dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-bash-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
