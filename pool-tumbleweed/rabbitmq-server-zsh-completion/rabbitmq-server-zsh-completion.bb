SUMMARY = "Zsh completion for rabbitmq-server"
DESCRIPTION = "Optional dependency offering zsh completion for rabbitmq-server."
LICENSE = "MPL-2.0"

PV = "3.12.0"

RPM_NAME = "rabbitmq-server-zsh-completion-3.12.0-2.1.noarch.rpm"
RPM_HASH = "db3232100751027ba3960cc03ee1738f0fed31c6b2d9d1135cedb9d014a931350e2d645096101bee6601f79a004e00ecd7cedf2527e1d5396a61247dd4dfc8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-server-zsh-completion"

RDEPENDS:${PN} += "rabbitmq-server \
zsh"

inherit rpm
