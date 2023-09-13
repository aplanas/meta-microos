SUMMARY = "Bash Completion for docker"
DESCRIPTION = "Bash command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.5_ce"

RPM_NAME = "docker-bash-completion-24.0.5_ce-2.1.noarch.rpm"
RPM_HASH = "d8bde9344cbff781464bca503084223600eee45381b9115ecf30babf76db075f7efc146e36884139f99a4418e0a5d1870acc9d23d4a5ec46be6c9ceac5d44f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion"

RDEPENDS:${PN} += "bash-completion \
docker"

inherit rpm
