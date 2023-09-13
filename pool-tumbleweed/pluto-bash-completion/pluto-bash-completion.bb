SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.4"

RPM_NAME = "pluto-bash-completion-5.18.4-1.1.noarch.rpm"
RPM_HASH = "0eceb71e44816cf6ea195e7bce8e5e9a20de6e60d1a9417a908847a0be55adda477937eae7cc21675e97280f07461cd76fe56bd8fbb1d4e44d3765dbeffc7277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
