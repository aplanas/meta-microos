SUMMARY = "Bash completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering bash completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-bash-completion-3.12.0-1.2.noarch.rpm"
RPM_HASH = "b6328d6bc4489ff38f39d25f0ffea8d418c74361b388ca37006cc9d5889803d01920424ffb81423fa4d93df3b784682435bb71ba10af4ec4400842e8c0356db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-bash-completion"

RDEPENDS:${PN} += "bash-completion \
rabbitmq-server"

inherit rpm
