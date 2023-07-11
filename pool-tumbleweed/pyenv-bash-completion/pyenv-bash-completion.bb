SUMMARY = "Bash completion for pyenv"
DESCRIPTION = "Bash command line completion support for pyenv."
LICENSE = "MIT"

PV = "2.3.21"

RPM_NAME = "pyenv-bash-completion-2.3.21-1.1.noarch.rpm"
RPM_HASH = "e1a27a4f299fc24927e4722a8484d418e484a45a711971f1afe8e78e99a5b604c3828bf7c0bd8a9e57132e790b86b1bb9ba5260cf2f48e353bef161af70c9d11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyenv-bash-completion"

RDEPENDS:${PN} += "pyenv"

inherit rpm
