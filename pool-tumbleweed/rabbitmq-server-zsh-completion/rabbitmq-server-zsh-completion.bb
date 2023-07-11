SUMMARY = "Zsh completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering zsh completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-zsh-completion-3.12.0-1.2.noarch.rpm"
RPM_HASH = "10bc4864fe1b68fdcbefbf6fa821157fd3d4a4147890e1321980c5eae4486a70ab189fddb29e7a01d457ca19b0264e1a4716ca6078b24a1ff2cc4f6bcb8a4f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-zsh-completion"

RDEPENDS:${PN} += "rabbitmq-server \
zsh"

inherit rpm
