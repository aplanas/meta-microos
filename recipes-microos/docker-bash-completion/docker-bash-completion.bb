SUMMARY = "Bash Completion for docker"
DESCRIPTION = "Bash command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "23.0.5_ce"

RPM_NAME = "docker-bash-completion-23.0.5_ce-1.1.noarch.rpm"
RPM_HASH = "7132c1ceae685e7664521084febfbb1222d2c4bec0aa29dd760ec6837f19f346896558d1ad9c84e62a9f24a0a3460be98106dd4492f949f912b8aaf0e54d49b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion"
RDEPENDS:${PN} += "bash-completion docker"

inherit rpm
