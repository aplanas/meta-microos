SUMMARY = "Zsh completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering zsh completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "3.11.3"

RPM_NAME = "rabbitmq-server-zsh-completion-3.11.3-1.3.noarch.rpm"
RPM_HASH = "c18060944ea97b23cbdbd9ede65dd9ac47c7564adb00f60818154c3e84c93f49f6b7f97c83224e7f9c365fed9ea65e6dc9eb6fd7b2f056d5a799858b101644ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-zsh-completion"

RDEPENDS:${PN} += "rabbitmq-server \
zsh"

inherit rpm
