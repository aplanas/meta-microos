SUMMARY = "Bash Completion for skaffold"
DESCRIPTION = "Bash command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "skaffold-bash-completion-2.7.0-1.1.noarch.rpm"
RPM_HASH = "da5fa1abd30516a8857cb98da9c0eb4c0439cc26ae538fd30db4fddfe2274b497d63b88ac32dc276dafbd1f04a3ffd1de29dd9cc5705170eac972166cff09834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skaffold"

inherit rpm
