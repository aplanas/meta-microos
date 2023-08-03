SUMMARY = "Bash Completion for docker"
DESCRIPTION = "Bash command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-bash-completion-24.0.5_ce-1.1.noarch.rpm"
RPM_HASH = "8601c0a681fc9ef439f06953d0352c12e672ad1736ecd5795e08aa00ddeeee2c6c2a59cccc1feeafdbcf6a850657b2cf4b0aeeb5f6d605dd4cc419d0d12067df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion"

RDEPENDS:${PN} += "bash-completion \
docker"

inherit rpm
