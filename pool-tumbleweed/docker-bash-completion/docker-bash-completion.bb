SUMMARY = "Bash Completion for docker"
DESCRIPTION = "Bash command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.4_ce"

RPM_NAME = "docker-bash-completion-24.0.4_ce-1.1.noarch.rpm"
RPM_HASH = "586feb19bc766c85294f098642142d7dcb2fdcbd9266b128702259aa6e9ce3bd5ec155d9638c49f2cf054365cd8c23e5849eb3cb5a511d49e1f0facf8cc7bbd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion"

RDEPENDS:${PN} += "bash-completion \
docker"

inherit rpm
