SUMMARY = "Bash Completion for swww"
DESCRIPTION = "Bash command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "swww-bash-completion-0.8.1-1.1.noarch.rpm"
RPM_HASH = "6df60397c5c5a675bed0f6948c65353989425c893feaa263237f762f2b5ccbccb3431b44fd79614fbe7c34ae50df0cb349f02c1b7511677a4333138f2e6bb510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
