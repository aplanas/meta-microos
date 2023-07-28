SUMMARY = "Bash completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering bash completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-bash-completion-3.12.0-2.1.noarch.rpm"
RPM_HASH = "f83b30a439136978e55d7abb5fd19b0f648812f27ac729abcc431705add7326fe886a36da74fbb98a4321dec8db01023fa343f2578bc4dce12fcd12322f8b8d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rabbitmq-server"

inherit rpm
