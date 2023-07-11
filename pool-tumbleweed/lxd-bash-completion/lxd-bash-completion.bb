SUMMARY = "Bash Completion for lxd"
DESCRIPTION = "Bash command line completion support for lxd."
LICENSE = "Apache-2.0"

PV = "5.13"

RPM_NAME = "lxd-bash-completion-5.13-2.1.noarch.rpm"
RPM_HASH = "c3fb90509398f30608a8f25da4879daea0be77b203a05b43fa1d3e68d645707cf8b14986bf20e137c166609c613624c7a7e5535d66e93bca0e5ee59e2790bef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxd-bash-completion"

RDEPENDS:${PN} += "lxd"

inherit rpm
