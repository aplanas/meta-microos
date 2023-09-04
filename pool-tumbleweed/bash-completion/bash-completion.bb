SUMMARY = "Programmable Completion for Bash"
DESCRIPTION = " \
 \
 \
 \
bash-completion is a collection of shell functions that take advantage \
of the programmable completion feature of Bash 2.04 and later."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "bash-completion-2.11-8.1.noarch.rpm"
RPM_HASH = "e522eeee4049dcc8cc172d09e1d7200cd4b7d089de77f61250a28e27aa1140e60b1c761db5daf0b9fdcb61cd6c37d0d922a9191b9baf1094456b34d023852300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion \
config-bash-completion"

RDEPENDS:${PN} += "bash"

inherit rpm
