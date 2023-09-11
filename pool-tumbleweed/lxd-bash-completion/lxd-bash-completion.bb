SUMMARY = "Bash Completion for lxd"
DESCRIPTION = "Bash command line completion support for lxd."
LICENSE = "Apache-2.0"

PV = "5.16"

RPM_NAME = "lxd-bash-completion-5.16-2.1.noarch.rpm"
RPM_HASH = "bf68a5169bfa8203d911149a84c6e43709ed5745db054b6a1f05f4f6609b21b740439ef266a6a6c68655b62b5597e0449bbc41cbed9206700c9e105d00c4d63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxd-bash-completion"

RDEPENDS:${PN} += "lxd"

inherit rpm
