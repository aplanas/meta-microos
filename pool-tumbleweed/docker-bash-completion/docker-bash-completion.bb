SUMMARY = "Bash Completion for docker"
DESCRIPTION = "Bash command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "23.0.6_ce"

RPM_NAME = "docker-bash-completion-23.0.6_ce-1.1.noarch.rpm"
RPM_HASH = "9e22021f5dab6e07ee690c7fc32c1e52b9d027868e4a8cc1c984425384d2a82616fce904147701c4872a80a9297a62eff5d28751cc26f1f665b508c202b6902b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion"

RDEPENDS:${PN} += "bash-completion \
docker"

inherit rpm
