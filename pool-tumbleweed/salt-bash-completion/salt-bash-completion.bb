SUMMARY = "Bash Completion for salt"
DESCRIPTION = "Bash command line completion support for salt."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-bash-completion-3006.0-1.1.noarch.rpm"
RPM_HASH = "c0c37d321e74cc0eb9df9c0cedebb6a4ca4a2cd179123b56a097728febe59b2f4bf7c3ca05cd8539e31063c3763a8ba87d5a09f9e3a8d9d00e7f33a5b6d2ea09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(salt-bash-completion) \
salt-bash-completion"

RDEPENDS:${PN} += "bash-completion \
salt"

inherit rpm
