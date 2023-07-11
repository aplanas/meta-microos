SUMMARY = "Bash Completion for skaffold"
DESCRIPTION = "Bash command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.1"

RPM_NAME = "skaffold-bash-completion-2.6.1-1.1.noarch.rpm"
RPM_HASH = "82d111dac6ae47e6973ac04c089c6f81a0b820fb7a2c00801306ecd250d1dad7f8d01234ef596796b63212285d83fcb90602781c8ece90ca6942a6a9e398a9e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skaffold"

inherit rpm
