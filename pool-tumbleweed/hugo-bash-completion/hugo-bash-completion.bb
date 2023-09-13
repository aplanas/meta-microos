SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0"

PV = "0.118.2"

RPM_NAME = "hugo-bash-completion-0.118.2-1.1.noarch.rpm"
RPM_HASH = "14988011fdb17686273b57c7fc54a936635951e5218607dd68518e8407ed7d77f06a851c6b9e862978c4f50812501cfb3705a748340b2de36cac43bca6917fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
