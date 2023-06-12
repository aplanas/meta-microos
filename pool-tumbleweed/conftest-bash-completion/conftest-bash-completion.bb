SUMMARY = "Bash Completion for conftest"
DESCRIPTION = "Bash command line completion support for conftest."
LICENSE = "Apache-2.0"

PV = "0.42.1"

RPM_NAME = "conftest-bash-completion-0.42.1-1.1.noarch.rpm"
RPM_HASH = "6ea74767cc70bbd7cd322e675d0ad1eef231c792d3adf93142c3dec7318c9f0bc68657e9283b1da2e61b619f62ac843000497796a7b97e787ab46b3772bec897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "conftest-bash-completion"
RDEPENDS:${PN} += "conftest"

inherit rpm
