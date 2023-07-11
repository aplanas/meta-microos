SUMMARY = "Bash Completion for kompose"
DESCRIPTION = "The official bash completion script for kompose, generated during the build."
LICENSE = "Apache-2.0"

PV = "1.28.0"

RPM_NAME = "kompose-bash-completion-1.28.0-1.1.noarch.rpm"
RPM_HASH = "5362c12270ade8f7d60ee2b6f4b613f51dd870a1eb5fd12f90ba2646ba02b3b83eb21c511c45c610d7fbee2a053379a2c5512c79836e4ea19c90eda4f819bd7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kompose-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
