SUMMARY = "Bash Completion for ripgrep"
DESCRIPTION = "The official bash completion script for ripgrep, generated during the build."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-bash-completion-13.0.0-5.3.noarch.rpm"
RPM_HASH = "0f96a8d5f60c28738f14f83a74d0da5c3028a3956b884ec8b97bcaf2c6cc2232667c738826479ee117af43fd4fc16e363fbb953fe424512267c6e6568ff9f304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ripgrep-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
