SUMMARY = "Bash Completion for hugo"
DESCRIPTION = "The official bash completion script for hugo, generated during the build."
LICENSE = "Apache-2.0"

PV = "0.116.1"

RPM_NAME = "hugo-bash-completion-0.116.1-1.1.noarch.rpm"
RPM_HASH = "21e1e9d9c7f064eecc9bbd1b160b62143404520afedd0750245b7937d679ae2c562fc2ed936b19d81652d5c165484b0492a8a9ab8a795a1be859ff73ceab1c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hugo-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
