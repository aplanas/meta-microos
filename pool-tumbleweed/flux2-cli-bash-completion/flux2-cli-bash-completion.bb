SUMMARY = "Bash Completion for flux2-cli"
DESCRIPTION = "Bash command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "flux2-cli-bash-completion-2.1.0-1.1.noarch.rpm"
RPM_HASH = "2836508422e95c619af7733d0c39ffb7701c80e353dd135d9464ac646726974580eb1d50461a2ff83374e82ca0204e3da092b3f4fb6964ce3865d557769aa1df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flux2-cli"

inherit rpm
