SUMMARY = "Bash Completion for nova"
DESCRIPTION = "Bash command line completion support for nova."
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "nova-bash-completion-3.6.5-1.2.noarch.rpm"
RPM_HASH = "94a7b1235e426816776ee768a8afa511dab473a43099628f9140e75720e2437e5abbb52c5ba89b720c3f62d2f2c11f8f21e9700a9de713d8abea18419b742365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nova-bash-completion"

RDEPENDS:${PN} += "bash-completion \
nova"

inherit rpm
