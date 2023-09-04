SUMMARY = "Bash Completion for swww"
DESCRIPTION = "Bash command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "swww-bash-completion-0.8.1-2.1.noarch.rpm"
RPM_HASH = "90ef4bcd40b020c320d7fc7f8c66dd3de8415f1cf176f8a4716412b9e3f3e6a84036d775c67a217d934b4faacefe60ddc933db759e4353d06f2bfc5b170aa612"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
