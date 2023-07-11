SUMMARY = "Bash Completion for docker"
DESCRIPTION = "Bash command line completion support for docker."
LICENSE = "Apache-2.0"

PV = "24.0.2_ce"

RPM_NAME = "docker-bash-completion-24.0.2_ce-2.1.noarch.rpm"
RPM_HASH = "94033bad77bec1ad215eb81a830b84aafb47a3fc667e2e0f7e17a8f9d0b8eb3c1466a8aba09fea0ff55be14a97986269d25f40ba770037d8061a69e800fa2798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docker-bash-completion"

RDEPENDS:${PN} += "bash-completion \
docker"

inherit rpm
